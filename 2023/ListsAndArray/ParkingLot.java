import java.util.*;

public class ParkingLot
{
    private ArrayList<String> cars;
    private int capacity;
    
    public ParkingLot(int capacity)
    {
        cars = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public Boolean addCar(String licencePlate){
        if(cars.size() < capacity)
        {
            cars.add(licencePlate);
            return true;
        }
        return false;
    }
    
    public String getCarAtPlace(int place){
        if(place>=0 && place < cars.size())
            return cars.get(place);
        return "Ooooops! Denne plassen er ugyldig, velg et tall mellom 0 og "+cars.size();
    } 
    
    public int getPlaceForCar(String licencePlate){
        int index = 0;
        while(index<cars.size())
        {
            String currentCar = cars.get(index);
            if(currentCar.equals(licencePlate))
                return index;
            index++;
        }
        return -1;
    }
    
    public void removeCar(String licencePlate)
    {
        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext())
        {
            String currentCar = iterator.next();
            if(currentCar.equals(licencePlate))
            {
                iterator.remove();
                return;
            }
        }
    }
    
}
