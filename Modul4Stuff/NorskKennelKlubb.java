import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
/**
 * Write a description of class NorskKennelKlubb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NorskKennelKlubb
{
    private ArrayList<Rase> raser;
    
    public NorskKennelKlubb()
    {
        raser = new ArrayList<>();
        
        raser.add(new Rase("Liten","Dachs",12));
        raser.add(new Rase("Stor","Grand Danois",8));
        raser.add(new Rase("Middels","Fillebikkje",3));
        raser.add(new Rase("Middels","Elghund",14));
    }
    
    public void printAllBreeds()
    {
        for(Rase rase : raser)
        {
            System.out.println(rase.getName());
        }
    }
    
    public void printAllBreedsWithWhile()
    {
        int index = 0;
        while(index < raser.size())
        {
            Rase rase = raser.get(index);
            System.out.println(rase.getName());
            index++;
        }
    }
    
    public void insertBreedAfterDachs()
    {
        ListIterator<Rase> iterator = raser.listIterator();
        while(iterator.hasNext())
        {
            Rase rase = iterator.next();
            if(rase.getName().equals("Dachs"))
            {
                iterator.add(new Rase("Liten","Mops",16));
            }
        }
    }
    
    public void removeBreed(String name)
    {
        Iterator<Rase> iterator = raser.iterator();
        while(iterator.hasNext())
        {
            Rase rase = iterator.next();
            if(rase.getName().equals(name))
            {
                iterator.remove();
            }
            
        }
    }
    
}
