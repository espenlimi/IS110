package no.uia;
import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {

    private ArrayList<Animal> animals ;

    public Zoo (){
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void printsAnimalsOfSpecies(String species){
        for(Animal animal:animals){
            if(animal.getSpecies().equalsIgnoreCase(species)){
                animal.print();
            }
        }
    }

    public void printAnimals()
    {
        for(Animal animal:animals){
            animal.print();
            animal.makeBabies();
            animal.makeSound();
        }

        for(int i = 0;i<animals.size();i++){
          Animal animal = animals.get(i);
          animal.print();
        }

        int index = 0;
        while(index<animals.size()){
            Animal animal = animals.get(index);
            animal.print();
            index++;
        }
        Iterator<Animal> iterator = animals.iterator();
        while(iterator.hasNext()){
            Animal animal = iterator.next();
            animal.print();
        }
    }
}
