
/**
 * Write a description of class EventPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EventPost extends SuperPost
{
    public EventPost(String author, String eventInformation, String startTime, String duration){
        super(author);
    }

    @Override
    public void displayDetails()
    {
        System.out.println("En time til ørsta rådhus");
    }
  }
