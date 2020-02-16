import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class P8Story extends JUnitStory {
    @Override
    public Configuration configuration()
    {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
        return new MostUsefulConfiguration().useStoryLoader(storyURL.getStoryURL() != null ?
                new LoadFromRelativeFile(storyURL.getStoryURL()) : new LoadFromClasspath(this.getClass()));
    }

    @Override
    public InjectableStepsFactory stepsFactory()
    {
        return new InstanceStepsFactory(configuration(), new P8Steps());
    }
}
