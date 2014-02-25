/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Main;

import com.tunisianwatch.Gui.AcceuilPanel;
import com.tunisianwatch.Gui.Authentification;
import com.tunisianwatch.Gui.CitoyenFormPanel;
import com.tunisianwatch.Gui.ConsultationPanel;
import com.tunisianwatch.Gui.MainFrame;
import com.tunisianwatch.Gui.StatistiquePanel;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Marwen
 */
public class Main {
    private static java.util.Date date;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            @Override
           public void run() {
               try {
                   new MainFrame().setVisible(true);
               } catch (Exception ex) {
                   Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       });
        
    }

}
