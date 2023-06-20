package main;



public class Vehicle {
 
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;

    
    

    public Vehicle(String type, String manufacturer, String model, int maxSpeed){
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        
        
        

    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    public String getType(){
        return type;
    }
    public String getModel(){
        return model;
    }
    public int getSpeed(){
        return maxSpeed;
    }
    

}
