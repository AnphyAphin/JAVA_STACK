class Account {
    private String name;     
    private double balance;  

    public Account(String name, double balance) {
        this.name = name;
        if (balance >= 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
            System.out.println("Initial balance invalid. Set to 0.0");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Practical5_qn1 {

    public static void main(String[] args) {

        Account acc1 = new Account("Alice", 500.00);
        Account acc2 = new Account("Bob", 1000.00);

        System.out.println(acc1.getName() + " initial balance: $" + acc1.getBalance());
        System.out.println(acc2.getName() + " initial balance: $" + acc2.getBalance());

        acc1.deposit(200.00);
        acc2.deposit(300.00);

        System.out.println(acc1.getName() + " balance after deposit: $" + acc1.getBalance());
        System.out.println(acc2.getName() + " balance after deposit: $" + acc2.getBalance());
    }
}