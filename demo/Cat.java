
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat
{
    private String name;

    public Cat(String name)
    {
        this.name = name;
    }
    
    public Cat()
    {
        name = "navnløs";
    }
    
    public void Mjau(){
        System.out.println(name+" sier mjau");
    }
}
