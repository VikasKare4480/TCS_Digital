
class BankAccount { 

    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposite(double amount) {

        balance += amount;
        System.out.println("Your account has been credited Rs. "  + amount +  " and updated balance is " + balance);
    }

    void withdraw(double amount) {

        if(amount < balance) {

            balance -= amount;
            System.out.println("Your account has been debited Rs. "  + amount +  " and updated balance is " + balance);

        }else {

            System.out.println("Insufficient Balance");
        }
    }

    void displayInfo() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        
        BankAccount _1 = new BankAccount(1001, 1000);
        _1.deposite(500);
        _1.withdraw(300);
        _1.displayInfo();
    }
}