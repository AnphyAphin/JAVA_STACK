class Employee {
    private static int count = 0; // static variable to track number of employees

    private String name; // instance variable

    public Employee(String name) {
        this.name = name;
        count++; // increment count whenever a new object is created
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }
}

public class Practical5_qn3 {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");

        System.out.println("Employee 1: " + emp1.getName());
        System.out.println("Employee 2: " + emp2.getName());

        System.out.println("Total number of Employee objects created: " + Employee.getCount());
    }
}