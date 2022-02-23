
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String id;
    private boolean hasPaid;
    
    public Car(String id){
        this.id = id;
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setHasPaid(boolean hasPaid)
    {
        this.hasPaid = hasPaid;
    }
    
    public boolean getHasPaid()
    {
        return hasPaid;
    }
}
