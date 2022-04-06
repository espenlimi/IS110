
package no.uia;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Testing, kalle metoder i andre klasser
        //Neste gang: Design patterns (kanskje)

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
