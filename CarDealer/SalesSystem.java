    import java.util.ArrayList;
    import java.util.*;
    /**
     * Write a description of class SalesSystem here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    public class SalesSystem
    {
        //1.Selg bil
        //2.Liste ut biler som er tilgjengelige
        //3.Vis info om bilen
        //4.Registrer bil som kan selges
        
        private ArrayList<Vehicle> vehicles;
        
        public SalesSystem(){
            vehicles = new ArrayList<>();
        }
        
        public void sellVehicle(Vehicle vehicle)
        {
            vehicles.remove(vehicle);
        }
        
        public void printVehicles(){
            //for loop
            for(int i = 0;i<vehicles.size();i++)
            {
                Vehicle vehicle = vehicles.get(i);
                System.out.println(vehicle);
            }
            
            //foreach
            for(Vehicle vehicle : vehicles)
            {
                System.out.println(vehicle);
            }
            
            int index = 0;
            while(index<vehicles.size())
            {
               Vehicle vehicle = vehicles.get(index);
               System.out.println(vehicle);
               index++;
            }
            
            ListIterator<Vehicle> iterator = vehicles.listIterator();
            while(iterator.hasNext())
            {
            Vehicle vehicle = iterator.next();
            if(vehicle.getPrice()<100)
            {
               
            }

            System.out.println(vehicle);
        }
        
        System.out.println("Starting the silly loop");        
        for(Iterator<Vehicle> iterator2 = vehicles.iterator();iterator2.hasNext();)
        {
            Vehicle vehicle = iterator2.next();
            System.out.println(vehicle);
        
        }
    }
    
    public void printVehicleDetails(int index)
    {   
        if(index >= vehicles.size() || index<0) 
        {
            System.out.println("Ugyldig index, prøv et tall mellom 0 og "+(vehicles.size()-1));
            return;
        }
        
        Vehicle vehicle = vehicles.get(index);
        System.out.println(vehicle);
    }
    
    public void registerVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);        
    }
    
}
