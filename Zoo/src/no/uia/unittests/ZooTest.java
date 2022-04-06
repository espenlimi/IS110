package no.uia.unittests;


import no.uia.Animal;
import no.uia.Mammal;
import no.uia.Zoo;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ZooTest {

    @Test
    public void addAnimal() {
        //Arrange
        ZooFake unitUnderTest = new ZooFake();

        //Act
        unitUnderTest.addAnimal(new Mammal("Frank","Kenguru"));
        List<Animal> allAnimals = unitUnderTest.addedAnimals;

        //Assert
        Assert.assertEquals("Kenguru",allAnimals.get(0).getSpecies());
        Assert.assertEquals(1, allAnimals.size());
    }
private Animal createTestMammal(String name, String species){
        Mammal mammal = new Mammal(name,species);
        //mammal.setHeight(500);
        return mammal;
}
    @Test
    public void getNumberOfAnimalsReturnsCorrectNumber(){
    //Arrange
        ZooFake unitUnderTest = new ZooFake();

        //Act
        unitUnderTest.addAnimal(createTestKangaroo());
        unitUnderTest.addAnimal(new Mammal("Frank","Kenguru"));
        unitUnderTest.addAnimal(new Mammal("Frank","Kenguru"));
        unitUnderTest.addAnimal(new Mammal("Frank","Kenguru"));
        unitUnderTest.addAnimal(new Mammal("Frank","Kenguru"));
        int numberOfAnimals = unitUnderTest.getNumberOfAnimals();

        //Assert
        Assert.assertEquals(5,numberOfAnimals);
    }

    private Mammal createTestKangaroo() {
        return new Mammal("Frank","Kenguru");
    }

    @Test
    public void washAnimalDoesNotSendFishToWash(){
        ZooFake unitUnderTest = new ZooFake();
        unitUnderTest.sendAnimalToTheWashingMachine(new Mammal("Nemo","Fish"));
        Assert.assertNull(unitUnderTest.washedAnimal);
    }

    @Test
    public void washAnimalDoesSendKenguruToWash(){
        ZooFake unitUnderTest = new ZooFake();
        unitUnderTest.sendAnimalToTheWashingMachine(new Mammal("Frank","Kenguru"));
        Assert.assertNotNull(unitUnderTest.washedAnimal);
    }

    public class ZooFake extends Zoo {
        public ArrayList<Animal> addedAnimals;
        public Animal washedAnimal;

        public ZooFake()
        {
            addedAnimals = new ArrayList<>();
        }

        @Override
        public void addAnimal(Animal a){
            addedAnimals.add(a);
            super.addAnimal(a);
        }
        @Override
        protected void sendToWash(Animal animal){
            washedAnimal = animal;
        }
    }
}
