import java.util.*;

public class ParkingLotArray
{
    private String[] cars;
    private int capacity;

    public ParkingLotArray(int capacity)
    {
        this.capacity = capacity;
        cars = new String[capacity];
    }

    public Boolean addCar(String licencePlate){
        for(int i = 0;i<cars.length;i++)
        {
            if(cars[i] == null){
                cars[i] = licencePlate;
                return true;
            }
            
        }
        return false;

    }

    public String getCarAtPlace(int place){
        if(place>=0 && place < cars.length)
        {
            if(cars[place]!=null)
            {
                return cars[place];
            }
            return "Ingen bil på plass";
        }
        return "Oops, velg en verdi mellom 0 og "+(cars.length-1);
    } 

    public int getPlaceForCar(String licencePlate){
        for(int i = 0;i<cars.length;i++)
        {
            if(cars[i] !=null && cars[i].equals(licencePlate))
                return i;
        }
        return -1;
    }

    public void removeCar(String licencePlate){
          for(int i = 0;i<cars.length;i++)
        {
            if(cars[i] !=null && cars[i].equals(licencePlate))
                cars[i] = null;
        }

    }

}
