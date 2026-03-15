import java.util.Scanner;
public class BankLoan { 
    int age;
    double annualIncome;
    BankLoan(int age,double annualIncome){
        this.age = age;
        this.annualIncome = annualIncome;
    }
    void checkEligibility(){
        if (age >= 21 && annualIncome >= 21000){
            System.out.println("Congratulations you qualify for a loan");
        }
        else{
            System.out.println("Unfortunately, we are unable to offer you a loan at this time");
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your annual income in Kenya shillings: ");
        double annualIncome = input.nextDouble();
        input.close();
        BankLoan loan = new BankLoan(age, annualIncome);
        loan.checkEligibility();
    }

}
