package main;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);   
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Engine> engines = new ArrayList<>();      
        boolean exit = false;
      
        while(!exit){
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            if(sc.hasNext()){
                int i = 0;
                int j=0;
                i = Integer.parseInt(sc.nextLine());
                switch(i){
                    case 1:
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        j = Integer.parseInt(sc.nextLine());
                        System.out.println("Anna kulkuneuvon valmistaja:");
                            String manufacturer = sc.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String model = sc.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            int maxSpeed = Integer.parseInt(sc.nextLine());
                        if(j == 1){
                            Vehicle newVehicle = new Car(manufacturer, model, maxSpeed);
                            Engine newEngine = new Engine("V8", 300);
                            vehicles.add(newVehicle);
                            engines.add(newEngine);
                        
                        }
                        else if (j == 2){
                            Vehicle newVehicle = new Plane(manufacturer, model, maxSpeed);
                            Engine newEngine = new Engine("suihkumoottori", 500);
                            vehicles.add(newVehicle);
                            engines.add(newEngine);
                            

                        } else if(j == 3) {
                            Vehicle newVehicle = new Ship(manufacturer, model, maxSpeed);
                            Engine newEngine = new Engine("Wärtsilä super", 1000);
                            vehicles.add(newVehicle);
                            engines.add(newEngine);
                            
                            
                        }
                        break;
                    case 2:
                        
                        for (int k = 0; k<vehicles.size(); k++ ){
                            Vehicle vehicle = vehicles.get(k);
                            Engine engine = engines.get(k);
                            
                            System.out.println(vehicle.getType() + ": " + vehicle.getManufacturer() + " "+ vehicle.getModel());
                            System.out.println("Moottori: " + engine.getName() + " " + engine.getPower()+ "kw");
                            System.out.println("Huippunopeus" + ": " + vehicle.getSpeed() + "km/h");
                            System.out.println();
                            
        }
                        
                        break;
                    case 3:
                        for(Vehicle vehicle : vehicles){
                            if (vehicle instanceof Car){
                                Car car = (Car) vehicle;
                                car.drive();

                            }
                            

                        }
                        
                        break;
                    case 4:
                        for(Vehicle vehicle : vehicles){
                            if (vehicle instanceof Plane){
                                Plane plane = (Plane) vehicle;
                                plane.fly();

                            }
                            

                        }
                        break;
                    case 5:
                        for(Vehicle vehicle : vehicles){
                            if (vehicle instanceof Ship){
                                Ship ship = (Ship) vehicle;
                                ship.sail();

                            }
                            

                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Väärä syöte");
                        break;
                }

            }
        }
        sc.close();
    }
}
