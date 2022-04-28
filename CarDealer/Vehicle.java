
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vehicle
{
    private int price;
    private String brand;
    private String color;
    private String licencePlate;

    public Vehicle(int price, String brand, String color, String licencePlate)
    {
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.licencePlate = licencePlate;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }
    public String getBrand(){return brand;}
    public String getColor(){return color;}
    public String getLicencePlate(){return licencePlate;}

    
}
