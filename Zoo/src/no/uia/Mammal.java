package no.uia;

public class Mammal extends Animal{

    public Mammal(String name, String species) {
        super(name, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Hei!");
    }

    @Override
    public void makeBabies() {
        System.out.println("I'm not typing this");
    }
}
