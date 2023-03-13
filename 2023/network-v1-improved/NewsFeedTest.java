

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NewsFeedTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NewsFeedTest
{
    /**
     * Default constructor for test class NewsFeedTest
     */
    public NewsFeedTest()
    {
    }
    
    @Test
    public void AddAndObserve()
    {
        NewsFeed feed = new NewsFeed();
        feed.addPost(new MessagePost("Esp1","Tekst"));
        feed.addPost(new PhotoPost("Esp2","file.png","photo"));
        
        feed.show();
    }
}
