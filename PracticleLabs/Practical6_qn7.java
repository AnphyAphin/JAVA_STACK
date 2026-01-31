class Employee {
    protected double salary = 30000.0; // arbitrary base salary

    public double getSalary() {
        return salary;
    }
}

class Programmer extends Employee {
    protected double bonusP = 5000.0; // arbitrary bonus for Programmer

    public double getTotalEarnings() {
        return salary + bonusP;
    }
}

class Accountant extends Employee {
    protected double bonusA = 7000.0; // arbitrary bonus for Accountant

    public double getTotalEarnings() {
        return salary + bonusA;
    }
}

public class Practical6_qn7 {

    public static void main(String[] args) {
        Programmer prog = new Programmer();
        System.out.println("Programmer Salary: " + prog.getSalary());
        System.out.println("Programmer Earnings (Salary + BonusP): " + prog.getTotalEarnings());

        /////////////////////////////////////////////////////////////////////////
        Accountant acc = new Accountant();
        System.out.println("Accountant Salary: " + acc.getSalary());
        System.out.println("Accountant Earnings (Salary + BonusA): " + acc.getTotalEarnings());
    }

}
