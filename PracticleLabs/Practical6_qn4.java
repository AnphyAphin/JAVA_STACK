// EmployeeA.java
class EmployeeA {
    protected float salary = 30000.0f; // arbitrary base salary

    public float getSalary() {
        return salary;
    }
}

// EmployeeB.java
class EmployeeB extends EmployeeA {
    protected float bonusB = 5000.0f; // arbitrary bonus for EmployeeB

    public float getTotalEarningsB() {
        return salary + bonusB;
    }
}

// EmployeeC.java
class EmployeeC extends EmployeeB {
    protected float bonusC = 7000.0f; // arbitrary bonus for EmployeeC

    public float getTotalEarningsC() {
        return salary + bonusB + bonusC;
    }
}

// EmployeesTest.java
public class Practical6_qn4 {

    public static void main(String[] args) {
        // Create object of EmployeeC
        EmployeeC empC = new EmployeeC();

        // Display earnings of each employee
        System.out.println("EmployeeA Salary: " + empC.getSalary());
        System.out.println("EmployeeB Earnings (Salary + BonusB): " + empC.getTotalEarningsB());
        System.out.println("EmployeeC Earnings (Salary + BonusB + BonusC): " + empC.getTotalEarningsC());
    }
}