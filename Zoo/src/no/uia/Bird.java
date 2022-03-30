package no.uia;

public class Bird extends Animal {

    public Bird(String name, String species) {
        super(name, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack");
    }

    @Override
    public void makeBabies() {
        System.out.println("Laying eggs");
    }


}
