class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (!isValidDate(month, day, year)) {
            throw new IllegalArgumentException(
                    "Invalid date: " + month + "/" + day + "/" + year);
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            return false;
        }

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // February in leap year
        }

        return day >= 1 && day <= daysInMonth[month - 1];
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +
                "\nBirth Date: " + birthDate +
                "\nHire Date: " + hireDate;
    }
}

public class Practical6_qn2 {
    public static void main(String[] args) {

        try {
            Date birth = new Date(7, 24, 1995); // Valid
            Date hire = new Date(2, 29, 2024); // Valid leap year

            Employee emp = new Employee("John", "Doe", birth, hire);
            System.out.println(emp);

            // Invalid dates (will throw exceptions)
            new Date(13, 10, 2022); // Invalid month
            new Date(4, 31, 2022); // April has 30 days
            new Date(2, 29, 2023); // Not a leap year

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
