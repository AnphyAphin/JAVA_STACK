class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn,
            double commissionRate, double grossSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0.0 && commissionRate < 1.0)
            this.commissionRate = commissionRate;
        else
            System.out.println("Invalid commission rate.");
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0.0)
            this.grossSales = grossSales;
        else
            System.out.println("Gross sales must be >= 0.0");
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nSSN: %s\nGross Sales: %.2f\nCommission Rate: %.2f",
                firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
            double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, ssn, commissionRate, grossSales); // call superclass constructor
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nBase Salary: %.2f", baseSalary);
    }
}

public class Practical6_qn8 {

    public static void main(String[] args) {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee(
                "John", "Doe", "123-45-6789", 0.1, 5000.0, 300.0);

        System.out.println("Employee Details:");
        System.out.println(emp.toString());
        System.out.printf("Total Earnings: %.2f%n", emp.earnings());
    }
}