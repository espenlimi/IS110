

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * The test class PetshopTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PetshopTest
{
    /**
     * Default constructor for test class PetshopTest
     */
    public PetshopTest()
    {
    }
    
    @Test
    public void addAnimalAddsAnimal()
    {
       //Arrange
       Petshop unitUnderTest = new Petshop();
       Animal animal = new Fish("Kjempetorsk");
       //Act
       unitUnderTest.addAnimal(animal);
       boolean exists = unitUnderTest.animalExists(animal);
       //Assert
       Assert.assertTrue(exists);
    }
    
    @Test
    public void animalExistsReturnsFalseOnEqual()
    {
       //Arrange
       Petshop unitUnderTest = new Petshop();
       Animal animal = new Fish("Kjempetorsk");
       Animal equalAnimal = new Fish("Kjempetorsk");
       //Act
       unitUnderTest.addAnimal(animal);
       boolean exists = unitUnderTest.animalExists(equalAnimal);
       //Assert
       Assert.assertTrue(exists);
    }
    
    @Test
    public void getMammalsOnlyReturnsMammals  ()
    {
       //Arrange
       Petshop unitUnderTest =getUnitUnderTestForMammalsTests();
       //Act
       ArrayList<Animal> result = unitUnderTest.getMammals();
       //Assert
       Animal pusur = result.get(0);
       Assert.assertEquals("Pusur", pusur.getSpecies());
       
    }
    
    @Test
    public void getMammalsOnlyReturnsCorrectNumberOfElements()
    {
       //Arrange
       Petshop unitUnderTest =getUnitUnderTestForMammalsTests();
       //Act
       ArrayList<Animal> result = unitUnderTest.getMammals();
       //Assert
       int expectedNumberOfItemsInList = 2;
       Assert.assertEquals(expectedNumberOfItemsInList, result.size());
       
    }
    
    private Petshop getUnitUnderTestForMammalsTests()
    {
       Petshop unitUnderTest = new Petshop();
       Animal animal = new Fish("Kjempetorsk");
       Animal equalAnimal = new Fish("Kjempetorsk");
       Animal bird = new Bird("Albatross");
       unitUnderTest.addAnimal(animal);
       unitUnderTest.addAnimal(equalAnimal);
       unitUnderTest.addAnimal(bird);
       unitUnderTest.addAnimal(new Cat("Pusur"));
       unitUnderTest.addAnimal(new Cat("Pusur"));
       return unitUnderTest;
    }
}
