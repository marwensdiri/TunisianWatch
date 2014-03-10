package com.tunisianwatch.fbConnect;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;
import com.tunisianwatch.Gui.MainFrame;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wael Mallek
 */
public class FbConnect {

    public static String API_KEY = "305489412915482";
    public static String SECRET = "d20076416897be3b315e391cb1c59609";

    public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
            + "client_id="
            + API_KEY
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";

    public static String secondRequest = "https://graph.facebook.com/oauth/access_token?"
            + "client_id="
            + API_KEY
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "client_secret=" + SECRET + "&code=";

    public static String access_token = ""; //18866f342fd968af1f83dbe9a15dd9fc
    public static boolean firstRequestDone = false;
    public static boolean secondRequestDone = false;

    /**
     * @param args
     */
    public static void conFb() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                NativeInterface.open();
                NativeInterface.initialize();
                //  FacebookTestClient testClient = new FacebookTestClient();

                final JFrame loginFrame = new JFrame();
                JPanel webBrowserPanel = new JPanel(new BorderLayout());
                // this is the JWebBrowser i mentioned earlier
                final JWebBrowser webBrowser = new JWebBrowser();
                // You can set this fields to false, or even let them activated
                webBrowser.setMenuBarVisible(false);
                webBrowser.setButtonBarVisible(false);
                webBrowser.setLocationBarVisible(false);
                final String fb_url = "http://www.facebook.com/";
                webBrowser.navigate(fb_url);
                webBrowser.navigate(firstRequest);
                webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
                    @Override
                    public void locationChanged(WebBrowserNavigationEvent e) {
                        super.locationChanged(e);
                        // Check if first request was not done
                        if (!firstRequestDone) {
                            // Check if you left the location and were redirected to the next 
                            // location
                            if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")) {
                                // If it successfully redirects you, get the verification code
                                // and go for a second request
                                String[] splits = e.getNewResourceLocation().split("=");
                                String stage2temp = secondRequest + splits[1];
                                System.out.println("First =" + splits[1]);
                                webBrowser.navigate(stage2temp);
                                firstRequestDone = true;
                            }
                        } else {
                            // If secondRequest is not done yet, you perform this and get the 
                            // access_token
                            if (!secondRequestDone) {
                                System.out.println(webBrowser.getHTMLContent());
                                // Create reader with the html content
                                StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
                                // Create a callback for html parser
                                HTMLEditorKit.ParserCallback callback
                                        = new HTMLEditorKit.ParserCallback() {
                                            @Override
                                            public void handleText(char[] data, int pos) {
                                                System.out.println(data);
                                                // because there is only one line with the access_token 
                                                // in the html content you can parse it.
                                                String string = new String(data);
                                                String[] temp1 = string.split("&");
                                                String[] temp2 = temp1[0].split("=");
                                                System.out.println("access tocken=" + temp2);
                                                access_token = temp2[1];
                                                loginFrame.dispose();
                                                retriveUser();
                                            }
                                        };
                                try {
                                    // Call the parse method 
                                    new ParserDelegator().parse(readerSTR, callback, false);
                                } catch (IOException e1) {
                                    e1.printStackTrace();
                                }

                            }
                        }
                    }
                });

                webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
                loginFrame.add(webBrowserPanel);
                loginFrame.setSize(500, 500);
                loginFrame.setVisible(true);

            }
        });
    }

    public static void retriveUser() {
        Utilisateur curU = new GraphReader(access_token).fetchObject();
        UtilisateurDao uDAO = new UtilisateurDao();
        Utilisateur user = uDAO.selectUserByMail(curU.getMail());
        if (user == null) {
            int id = uDAO.insertUser(curU);
            curU.setId(id);
            MainFrame.getInstance(curU).setVisible(true);
        }
        else{
            MainFrame.getInstance(user).setVisible(true);
        }
    }

    public static String getAccessToken() {
        return access_token;
    }

}
