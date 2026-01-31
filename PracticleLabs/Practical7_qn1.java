// abstract 
abstract class Employee {
    String firstName;
    String lastName;
    String idNumber;

    // Constructor
    Employee(String firstName, String lastName, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    // Abstract methode
    abstract double earnings();

    String describe() {
        return firstName + " " + lastName + " (ID: " + idNumber + " )";
    }

}

class SalariedEmployee extends Employee {
    double weeklySalary;

    // Constructor
    SalariedEmployee(String firstName, String lastName, String idNumber, double weeklySalary) {
        super(firstName, lastName, idNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    double earnings() {
        return weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    HourlyEmployee(String firstName, String lastName, String idNumber, double hourlyRate, double hoursWorked) {
        super(firstName, lastName, idNumber);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double earnings() {
        if (hoursWorked <= 40)
            return hourlyRate * hoursWorked;
        else
            return 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5;
    }

}

class CommissionEmployee extends Employee {
    double sales;
    double commissionRate;

    // Costructor
    CommissionEmployee(String firstName, String lastName, String idNumber, double sales, double commissionRate) {
        super(firstName, lastName, idNumber);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    double earnings() {
        return sales * commissionRate;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    // Constructor
    BasePlusCommissionEmployee(String firstName, String lastName, String idNumber, double sales, double commissionRate,
            double baseSalary) {
        super(firstName, lastName, idNumber, sales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    double earnings(){
        return (baseSalary*1.10) + super.earnings(); 
    }
}

public class Practical7_qn1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Alice", "Smith", "E001", 800.00);
        employees[1] = new HourlyEmployee("Bob", "Jones", "E002", 20.00, 45);
        employees[2] = new CommissionEmployee("Charlie", "Brown", "E003", 10000, 0.06);
        employees[3] = new BasePlusCommissionEmployee("Diana", "Prince", "E004", 5000, 0.04, 300);

        for (Employee emp : employees) {
            System.out.println(emp.describe() + " earned: $" + emp.earnings());
        }

    }
}
