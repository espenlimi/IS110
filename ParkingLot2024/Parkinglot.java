
/**
 * Write a description of class Parkinglot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parkinglot
{
    private Car[] parkingSpaces;
    
    public Parkinglot()
    {
        parkingSpaces = new Car[15];
        for(int i = 0; i<parkingSpaces.length;i++)
        {
           parkingSpaces[i] = new Car(""+i);
        }
    }
    
    public void parkCar(String licencePlate)
    {
        for(int i = 0; i<parkingSpaces.length;i++)
        {
            Car car = parkingSpaces[i];
            if(car == null)
            {
                parkingSpaces[i] = new Car(licencePlate);
                return;
            }
        }
        System.out.println("Beklager, det er fullt!");
    }
    
    public void exitCar(String licencePlate)
    {
        for(int i = 0; i<parkingSpaces.length;i++)
        {
            Car car = parkingSpaces[i];
            if(car != null && car.getLicencePlate().equals(licencePlate))
            {
                parkingSpaces[i] = null;
                return;
            }
        }
        System.out.println("Er du sikker på at du parkerte her?");
    }
    
}
