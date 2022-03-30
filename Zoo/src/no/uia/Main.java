
package no.uia;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Lister, løkker (inkl iterator), bluej i intellij, polymorfe metoder, abstrakte klasser,  osv..

        Zoo zoo = new Zoo();
        zoo.addAnimal(new Mammal("Mikke","Mus"));
        zoo.addAnimal(new Mammal("Donald","And"));
        zoo.addAnimal(new Mammal("Pluto","Hund"));
        zoo.addAnimal(new Mammal("Fant","Hund"));
        zoo.addAnimal(new Mammal("Voffen","Hund"));
        zoo.addAnimal(new Mammal("Simba","Løve"));
        zoo.addAnimal(new Bird("Baghera","Panter"));
        zoo.addAnimal(new Bird("Baloo","Bjørn"));

        zoo.printAnimals();

        //zoo.printsAnimalsOfSpecies("huND");
    }
}
