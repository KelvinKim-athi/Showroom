//Kimathi Kelvin Murithi.  CT100/G/22517/24
class unitsOffered {
    void displayUnits(){
        System.out.println("Units Offered This Semester:");
        System.out.println("1. Application programming I");
        System.out.println("2. Cloud Computing");
        System.out.println("3. Mobile Computing");
        System.out.println("4. Network Systems Administration");
        System.out.println("5. Object Oriented Analysis and Design");
        System.out.println("6. Object Oriented Programming II");      
 } 
    public static void main(String[]args){
        unitsOffered units = new unitsOffered();
        units.displayUnits(); //calling method to display units
    }
}

