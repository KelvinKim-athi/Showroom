//Kelvin Murithi Kimathi. CT100/G/22517/24
import java.util.Scanner;
public class cylinder {
    double h, r,volume,surfaceArea,pi=3.147;
    void calculate(){
    surfaceArea = 2*pi*r*r +  2*pi*r*h ; 
    volume = pi*r*r*h;
    }
   void calcVolume(){
        System.out.println("the volume of the cylinder is: "+ volume);
    }
    void calcSurfaceArea(){
        System.out.println("The surface area of the cylinder is: "+ surfaceArea);
    }
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double r = input.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double h = input.nextDouble();
        input.close();
        cylinder cyl = new cylinder();
        cyl.r = r;
        cyl.h = h;
        cyl.calculate();
        cyl.calcVolume();
        cyl.calcSurfaceArea();
    }
}
