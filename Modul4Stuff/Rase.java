
/**
 * Write a description of class Rase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rase
{
    private String size;
    private String name;
    private int lifespan;
    
    public Rase(String size, String name, int lifespan)
    {
        this.size = size;
        this.name = name;
        this.lifespan = lifespan;
    }
    
    public String getName()
    {
        return name;
    }
}
