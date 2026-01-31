abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
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

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s\nSSN: %s", firstName, lastName, socialSecurityNumber);
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "Salaried Employee: " + super.toString() +
                String.format("\nWeekly Salary: %.2f", weeklySalary);
    }
}

class HourlyEmployee extends Employee {
    private double wage; // hourly wage
    private double hours; // hours worked

    public HourlyEmployee(String firstName, String lastName, String ssn,
            double wage, double hours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (hours <= 40)
            return wage * hours;
        else
            return (40 * wage) + ((hours - 40) * wage * 1.5);
    }

    @Override
    public String toString() {
        return "Hourly Employee: " + super.toString() +
                String.format("\nHourly Wage: %.2f; Hours Worked: %.2f", wage, hours);
    }
}

class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn,
            double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return "Commission Employee: " + super.toString() +
                String.format("\nGross Sales: %.2f; Commission Rate: %.2f", grossSales, commissionRate);
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
            double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        // Reward: add 10% to base salary
        return (baseSalary * 1.10) + super.earnings();
    }

    @Override
    public String toString() {
        return "Base-Salaried Commission Employee: " + super.toString() +
                String.format("\nBase Salary (with 10%% bonus): %.2f", baseSalary * 1.10);
    }
}

public class Practical6_qn9 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        employees[1] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 42);
        employees[2] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
        employees[3] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);

        for (Employee emp : employees) {
            System.out.println(emp); // calls overridden toString
            System.out.printf("Earned: $%.2f%n%n", emp.earnings());
        }
    }
}