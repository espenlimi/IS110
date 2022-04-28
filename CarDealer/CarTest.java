import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CarTest
{
    /**
     * Default constructor for test class CarTest
     */
    public CarTest()
    {
    }

    @Test
    public void equalsReturnsTrueForTwoObjectsWithSameValues()
    {

       Car car1 = new Car(1337,"Volvo","Beige","asd",5);
       Car car2 = new Car(1337,"Volvo","Beige","asd",5);
       boolean result = car1.equals(car2);
        
       assertEquals(true,result);
    }
    
    @Test
    public void equalsReturnsFalseForTwoObjectsWithDifferentValues()
    {
       Car car1 = new Car(1337,"Volvo","SuperGreen","asd",5);
       Car car2 = new Car(1337,"Volvo","Beige","asd",5);
    
       boolean result = car1.equals(car2);
        
       assertEquals(false,result);
    }
    
    @Test
    public void equalsReturnsTrueForTwoVariablesPointingToSameObject()
    {
       Car car1 = new Car(1337,"Volvo","Beige","asd",5);
       Car car2 = car1;
       boolean result = car1.equals(car2);
        
       assertEquals(true,result);
    }
}
