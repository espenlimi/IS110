

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ParkinglotTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ParkinglotTest
{
    /**
     * Default constructor for test class ParkinglotTest
     */
    public ParkinglotTest()
    {
    }

    @Test
    public void parkCarReturnsTrueWhenParkingInEmptyLot()
    {
        ///AAA
        //Arrange
        Parkinglot unitUnderTest = new Parkinglot(3);
        Car car = new Car("id");
        //Act
        boolean result = unitUnderTest.parkCar(car);
        //Assert
        assert result = true;
    }
    
    @Test(expected = NegativeArraySizeException.class)
    public void parkingLotThrowsExceptionWhenInitializedWithNegativeCapacity()
    {
        new Parkinglot(-1);
    }

    public void setUp()
    {
    }

    public void tearDown()
    {
    }
}
