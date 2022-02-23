import java.util.HashMap;
/**
 * Write a description of class Parkinglot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parkinglot
{
    private Car[] parkingSlots;
    private HashMap<String,String> hashMap;
    
    public Parkinglot(int capacity)
    {
        parkingSlots = new Car[capacity];
    }
    
    public boolean parkCar(Car car)
    {
        return parkCar(car, getFirstAvailableSlot());
    }
    
    public boolean parkCar(Car car, int index)
    {
        car.setHasPaid(false);
        if(index < 0 || index >= parkingSlots.length)
        {
            System.out.println("Invalid slot");
            return false;
        }
        
        if(parkingSlots[index] != null)
        {
            System.out.println("Slot is occupied, keep trying");
            return false;
        }
       
        parkingSlots[index] = car;
        return true;
    }
    
    public boolean leaveSlot(String carId)
    {
        for(int i = 0;i<parkingSlots.length;i++)
        {
            Car car = parkingSlots[i];
            if(car!=null && car.getId().equals(carId) && car.getHasPaid())
            {
                parkingSlots[i] = null;
                System.out.println("The car has left the parkinglot");
                return true;
            }
        }
        System.out.println("Car not found :( ");
        return false;
    }
    
    public int getFirstAvailableSlot()
    {
        boolean found = false;
        int index = 0;
        while(!found && index < parkingSlots.length)
        {
            if(parkingSlots[index] == null)
               return index;
            index++;
        }
        return -1;
    }
    
    public boolean pay(String carId)
    {
        for(int i = 0;i<parkingSlots.length;i++)
        {
            Car car = parkingSlots[i];
            if(car!=null && car.getId().equals(carId) && !car.getHasPaid())
            {
                car.setHasPaid(true);
                System.out.println("Fee has been paid");
                return true;
            }
        }
        System.out.println("Car not found :( ");
        return false;
    }
}
