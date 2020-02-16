import java.net.MalformedURLException;
import java.net.URL;

public class storyURL {
    private storyURL(){}
    public static URL getStoryURL(){
        URL StoryURL = null;
        try {
            StoryURL = new URL("file://" + System.getProperty("user.dir")  + "" + "\\src\\main\\java");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return StoryURL;
    }
}
