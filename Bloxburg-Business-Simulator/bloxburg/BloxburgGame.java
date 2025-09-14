package bloxburg;
import java.util.Scanner;

public class BloxburgGame{
    public static void main(String[] args){
        // Variables for input into objects
        String businessName;
        String businessOwner;
        double businessFunds;
        String employeeName;
        String employeeRole;
        double employeeSalary;
        double employeeHours;

        // Object for keyboard input
        Scanner input = new Scanner(System.in);
        
        // Input information for business
        System.out.println("--- INPUT THE BUSINESS INFORMATION ---");
        System.out.println("Input the name of the business: ");
        businessName = input.nextLine();
        System.out.println("Input the name of the business owner: ");
        businessOwner = input.nextLine();
        System.out.println("Input how many funds the business has: ");
        businessFunds = input.nextDouble();
        input.nextLine();

        // Input the info for the employee
        System.out.println("\n--- INPUT THE EMPLOYEE INFORMATION ---");
        System.out.println("Input the name of the employee: ");
        employeeName = input.nextLine();
        System.out.println("Input their role: ");
        employeeRole = input.nextLine();
        System.out.println("Input their salary: ");
        employeeSalary = input.nextDouble();
        System.out.println("Input the hours they worked: ");
        employeeHours = input.nextDouble();
        input.nextLine();

        // Create the objects for the business and singular employee
        Business pizzaPlace = new Business(businessName, businessOwner, businessFunds);
        Business.Employee chefEmployee = pizzaPlace.new Employee(employeeName, employeeRole, employeeSalary, employeeHours);

        // Output welcome and information about businesses
        System.out.println("\n--- WELCOME TO THE BLOXBURG BUSINESS SIMULATOR! ---");
        pizzaPlace.outputBusinessInfo();
        pizzaPlace.payTaxes();

        // Display and pay employees
        chefEmployee.displayEmployee();
        chefEmployee.payEmployee();
    }
}