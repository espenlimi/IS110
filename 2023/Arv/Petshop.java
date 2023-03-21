import java.util.*;
public class Petshop
{
    /*      
    liste alle dyr
    sjekke om ett dyr finnes, 
    for eksempel blant hund, eller katt eller fugl
    liste alle pattedyr
       */
    private ArrayList<Animal> animals;
    
    public Petshop(){
        animals = new ArrayList<>();
    }
    
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    
    public boolean animalExists(Animal animal){
        
        Iterator iterator = animals.iterator();
        while(iterator.hasNext())
        {
           Animal current = (Animal)iterator.next();
           boolean sametype =  animal.getClass().equals(current.getClass());
           boolean sameSpecies = animal.getSpecies().equals(current.getSpecies());
           if( sametype && sameSpecies)
           {
               return true;
           }
        }
        return false; 
    }
    
    public ArrayList<Animal> getMammals(){
        ArrayList<Animal> animalsOfType = new ArrayList<>();
        for(Animal animal : animals)
        {
            if(animal instanceof Mammal)
            {
                animalsOfType.add(animal);
            }
        }
        
        return animalsOfType;
    }
    
    
}
