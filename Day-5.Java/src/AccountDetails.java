import java.util.Scanner;
class Account {

    private int id;
    private String accountType;
    private double balance;

    public Account() {

    }

    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;

    }
    public String GetDetails() {
        return "Accountant ID: " + id + "\nAccount Type: " + accountType +
                "\nBalance: " + balance;
    }

    public boolean withdraw(double withamount) {
        if (balance >= withamount) {
            balance = balance - withamount;
            return true;
        } else {
            return false;
        }
    }


}
    public class AccountDetails {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Account Number :");
            int accNumber = sc.nextInt();
            System.out.println("Enter the Account Type :");
            String accType = sc.next();
            System.out.println("Enter the Account Balance :");
            double balance = sc.nextDouble();
            System.out.println("Enter the Amount to Withdraw :");
            double withamount = sc.nextDouble();
            Account ac = new Account(accNumber,accType,balance);
            System.out.println(ac.GetDetails());
            ac.withdraw(withamount);
            System.out.println("The Current balance :" + balance);

        }
    }

