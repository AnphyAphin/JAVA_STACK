// Date.java
class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}

// Employee.java
class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // Constructor
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName +
               "\nBirth Date: " + birthDate +
               "\nHire Date: " + hireDate;
    }
}

// EmployeeTest.java
public class Practical6_qn1 {
   
    public static void main(String[] args) {
     // Create Date objects
        Date birth = new Date(5, 15, 1995);   // May 15, 1995
        Date hire = new Date(1, 10, 2020);    // Jan 10, 2020

        // Create Employee object
        Employee emp = new Employee("John", "Doe", birth, hire);

        // Display Employee information
        System.out.println(emp);   
    }
}
