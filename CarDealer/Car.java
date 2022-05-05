
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle 
{
    private int numberOfDoors;
    
    public Car(int price, String brand, String color, String licencePlate, int numberOfDoors)
    {
        super(price, brand, color, licencePlate);
        this.numberOfDoors = numberOfDoors;
    }
    
    public void setNumberOfDoors(int numberOfDoors) throws IllegalArgumentException
    {
        if(numberOfDoors<1){
            throw new IllegalArgumentException("I NEED DOORS!!");
        }
    }
    
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    
    @Override
    public String toString()
    {
        return "Bilen med "+numberOfDoors+" antall dører av merke "+getBrand()+" i fargen "+getColor()+" selges for "+getPrice()+ " penger" ;
    }
    
    @Override
    public boolean equals (Object o)
    {
        if(o==null)
            return false;  
        if(!(o instanceof Car))
            return false;
        Car other = (Car)o;
        
        if(!other.getBrand().equals(this.getBrand()))
            return false;
        if(!other.getColor().equals(this.getColor()))
            return false;
        if(!other.getLicencePlate().equals(this.getLicencePlate()))
            return false;    
        if(other.getPrice()!=this.getPrice())
            return false;         
        if(other.getNumberOfDoors() != this.getNumberOfDoors())
            return false;           
        
       return true;
    }
    
    @Override
    public int hashCode()
    {
        int result = 17;
        result = 37 * result+ ((getLicencePlate() == null) ? 0 : getLicencePlate().hashCode());
        return result;
    }
}
