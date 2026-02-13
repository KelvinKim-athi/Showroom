import java.util.Scanner;
class Vehicle{
String brand,model;
int year;
//creating a constructor
Vehicle(String brand,String model,int year){
    this.brand = brand;
    this.model = model;
    this.year = year;
} 
void displayDetails(){
    System.out.println("vehicle details: " + "\nVehicle brand: "+ brand + "\nVehicle model: "+ model + "\nVehicle year: "+ year );   
}
}
//subclass
class Car extends Vehicle{
String fuelType;
//constructor that initializes Vehicle and Car
Car(String brand,String model,int year,String fuelType){
    super(brand,model,year);
    this.fuelType = fuelType;
}
//overriding the displayDetails 
@Override
void displayDetails(){
    super.displayDetails();
    System.out.println("Fuel type: "+ fuelType);
}
}
public class Showroom {
 public static void main(String []args){
Scanner scan = new Scanner(System.in);
//brand input
System.out.println("Enter Vehicle brand: ");
String brand = scan.nextLine();
//model input
System.out.println("Enter Vehicle model: ");
String model = scan.nextLine();
//year input
System.out.println("Enter Vehicle year: ");
int year = scan.nextInt();
scan.nextLine();
//fuel  type input
System.out.println("Enter Vehicle fuel type: ");
String fuelType = scan.nextLine();
scan.close();
//creating Car objects
Car c_ar = new Car(brand,model,year,fuelType);
c_ar.displayDetails();
 }   
}
