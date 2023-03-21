
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    private String species;
    private int numberOfLegs;
    private String sound;
    private int price;
    
    public Animal(String species, int numberOfLegs, String sound)
    {
     this.species = species;
     this.numberOfLegs = numberOfLegs;
     this.sound = sound;
    }
    
    public String getSpecies(){
        return species;
    }
    
    public int getNumberOfLegs(){
        return numberOfLegs;
    }
    
    public String getSound(){
        return sound;
    }
    
    public int getPrice(){
        return price;
    }
}
