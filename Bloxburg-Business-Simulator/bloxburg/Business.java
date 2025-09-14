package bloxburg;

public class Business {
    private String name;
    private String owner;
    private double funds;
    private static int totalBusinesses = 0;
    public static final double TAX_RATE = 0.1;

    // Set the name, owner, available funds, and increment business
    public Business(String name, String owner, double funds) {
        this.name = name;
        this.owner = owner;
        this.funds = funds;
        totalBusinesses++;
    }

    // Constructor for business with only a name
    public Business(String name){
        this(name, "null", 0);
    }

    // Constructor for business with name and starting funds
    public Business(String name, double funds){
        this(name, "null", funds);
    }

    // Deduct taxes from funds
    public void payTaxes(){
        funds -= funds * TAX_RATE;
        System.out.println("Funds after taxes: $" + funds + "\n");
    }

    // Output funds
    public void outputBusinessInfo(){
        System.out.println("Total businesses created: " + totalBusinesses + "\n");
        System.out.println("Business: " + name);
        System.out.println("Owner: " + owner);
        System.out.println("Funds before taxes: $" + funds);
    }

    // A business has a employee...
    class Employee {
        private String name;
        private String role;
        private double hoursWorked;
        private double salary;

        // Construct an employee
        public Employee(String name, String role, double salary, double hoursWorked){
            this.name = name;
            this.role = role;
            this.salary = salary;
            this.hoursWorked = hoursWorked;
        }
        
        // Display employee information
        public void displayEmployee(){
            System.out.println("Employee: " + name + " | " + "Role: " + role + " | " + "Salary: $" + salary + "/hour");
        }

        // Pay the employee
        public void payEmployee(){
            double employeePay = salary * hoursWorked;
            funds -= employeePay;
            System.out.println("The employee " + name + " worked " + hoursWorked + " hours as a " + role + " and made $" + employeePay + "\n");
            System.out.println("Funds after paying employee: $" + funds  + "\n");
        }
    }
}
