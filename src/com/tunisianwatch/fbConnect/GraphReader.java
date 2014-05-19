package com.tunisianwatch.fbConnect;

import com.restfb.BinaryAttachment;
import com.restfb.Connection;
import static java.lang.System.out;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Comment;
import com.restfb.types.FacebookType;
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.restfb.types.User;
import com.tunisianwatch.Entities.CommentFaceBook;
import com.tunisianwatch.Entities.Reclamation;
import com.tunisianwatch.Entities.StatusFaceBook;
import com.tunisianwatch.Entities.Utilisateur;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("deprecation")
public class GraphReader {

    /**
     * RestFB Graph API client.
     */
    private static FacebookClient facebookClient;

    /**
     * Entry point. You must provide a single argument on the command line: a
     * valid Graph API access token.
     *
     * @param args Command-line arguments.
     * @throws IllegalArgumentException If no command-line arguments are
     * provided.
     */
    public static void main(String[] args) {

    }

    GraphReader(String accessToken) {

        facebookClient = new DefaultFacebookClient(accessToken);

    }

    void runEverything() {
        fetchObject();
//    fetchObjects();
//    fetchObjectsAsJsonObject();
//    fetchConnections();
//    fetchDifferentDataTypesAsJsonObject();
//    query();
//    multiquery();
//    search();
//    metadata();
//    paging();
//    selection();
//    parameters();
//    rawJsonResponse();
    }

    Utilisateur fetchObject() {
        out.println("* Fetching single objects *");

        User user = facebookClient.fetchObject("me", User.class);
        Utilisateur curUser = new Utilisateur();
        curUser.setLogin(user.getUsername());
        curUser.setNom(user.getLastName());
        curUser.setPrenom(user.getFirstName());
        curUser.setType('C');
        // System.out.println("Name: " + user.getName());
        //System.out.println("Username: " + user.getUsername());
        curUser.setMail(user.getEmail());
        if (user.getBirthday() != null) {
            curUser.setDateNaissance(user.getBirthdayAsDate());
        }
        return curUser;
    }

    /**
     * Holds results from a "fetchObjects" call.
     */
    //by habchi
    public static String getAcessToken() {
        return FbConnect.access_token;
    }

    public static List<StatusFaceBook> getStatus() {
        Connection<Post> myFeed = facebookClient.fetchConnection("192540037522925/feed", Post.class);
        List<StatusFaceBook> listStatus = new ArrayList<StatusFaceBook>();
        for (List<Post> myFeedConnectionPage : myFeed) {
            for (Post post : myFeedConnectionPage) {
                if (post.getType().equals("status") && post.getMessage() != null) {
                    StatusFaceBook status = new StatusFaceBook();
                    status.setMessage(post.getMessage());
                    status.setDate(post.getCreatedTime());
                    status.setId(post.getId());
                    if (post.getLikesCount() != null) {
                        status.setNblike(post.getLikesCount());
                    }
                    if (post.getComments() != null) {
                        for (Comment C : post.getComments().getData()) {
                            CommentFaceBook comment = new CommentFaceBook();
                            comment.setId(C.getId());
                            comment.setNom(C.getFrom().getName());
                            comment.setDate(C.getCreatedTime());
                            comment.setMessage(C.getMessage());
                            comment.setCanRemove(C.getCanRemove().booleanValue());
                            status.addComment(comment);
                        }
                    }
                    listStatus.add(status);
                }
            }

        }
        return listStatus;
    }

    public static boolean isConnect() {
        if (facebookClient != null) {
            return true;
        } else {
            return false;
        }
    }

    public static String addComment(String idpost, String message) {
        FacebookType publishMessageResponse = facebookClient.publish(idpost + "/comments", FacebookType.class, Parameter.with("message", message));
        return publishMessageResponse.getId();
    }

    public static boolean deleteComment(String idComment) {
        Boolean deleted = facebookClient.deleteObject(idComment);
        return deleted.booleanValue();
    }

    public static String share(Reclamation reclamation) throws FileNotFoundException {
        if (reclamation.getListDocument().size() > 0) {
            InputStream is = new FileInputStream(new File(reclamation.getListDocument().get(0).getPath()));
            FacebookType publishMessageResponse
                    = facebookClient.publish("me/photos", FacebookType.class, BinaryAttachment.with("myphoto", is),
                            Parameter.with("message", reclamation.getTitre()+"\n Description: "+reclamation.getDescription()+" -"+reclamation.getDate().toString()));
            return publishMessageResponse.getId();
        } else {
            FacebookType publishMessageResponse
                    = facebookClient.publish("me/feed", FacebookType.class,
                            Parameter.with("message", reclamation.getTitre()+"\n Description: "+reclamation.getDescription()+"\n"+reclamation.getDate().toString()));
            return publishMessageResponse.getId();
        }
    }
}
