package no.uia;

public abstract class Animal {

    private String name;
    private String species;

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String getSpecies(){
        return species;
    }

    public void print(){
        System.out.println(name +" is a "+species);
    }

    public abstract void makeSound();
    public abstract void makeBabies();
}
