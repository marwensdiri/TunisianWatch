package fbConnect;

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
import com.tunisianwatch.Entities.StatusFaceBook;
import com.tunisianwatch.Entities.Utilisateur;
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
        Page page = facebookClient.fetchObject("cocacola", Page.class);
        Utilisateur curUser = new Utilisateur();
        curUser.setLogin(user.getUsername());
        curUser.setNom(user.getLastName());
        curUser.setPrenom(user.getFirstName());
        curUser.setType('C');
        // System.out.println("Name: " + user.getName());
        //System.out.println("Username: " + user.getUsername());
        curUser.setMail(user.getEmail());

        //System.out.println("Email: " + user.getEmail());
        return curUser;
        //out.println("Page likes: " + page.getLikes());
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
                    if (post.getLikesCount() != null){
                        status.setNblike(post.getLikesCount());
                    }
                    if (post.getComments() != null) {
                        for (Comment C : post.getComments().getData()) {
                            CommentFaceBook comment = new CommentFaceBook();
                            comment.setNom(C.getFrom().getName());
                            comment.setDate(C.getCreatedTime());
                            comment.setMessage(C.getMessage());
                            status.addComment(comment);
                        }
                    }
                    listStatus.add(status);
                }
            }

        }
        return listStatus;
    }

    public static String addComment(String idpost, String message) {
        FacebookType publishMessageResponse = facebookClient.publish(idpost + "/comments", FacebookType.class, Parameter.with("message", message));
        return publishMessageResponse.getId();
    }

    public static void deleteComment(String idComment) {

    }

}
