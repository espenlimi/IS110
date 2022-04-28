
/**
 * Write a description of class MotorCycle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MotorCycle extends Vehicle
{

   public MotorCycle(int price, String brand, String color, String licencePlate)
    {
        super(price, brand, color, licencePlate);
    }
    
       @Override
    public String toString()
    {
        return "Sykkelen av merke "+getBrand()+" i fargen "+getColor()+" selges for "+getPrice()+ " penger";
    }
}
