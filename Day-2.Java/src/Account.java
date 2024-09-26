import java.util.Scanner;

public class Account {
    int accno;
    String name;
    double balance;
    public Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited " + amount + " to " + name+"Balance: " + balance);

        }
        else {
            System.out.println("Invalid Deposit");
        }
        }
        public void withdraw(double amount) {
        if(amount >0 && amount >= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn " + amount + " to " + name+"Updated Balance: " + balance);
        }
        else {
            System.out.println("Insufficient Withdraw");
        }
    }
    public void display() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(100023,
               "vikki", 50000);
        System.out.println("\n1.Deposit"+"\n2.Withdraw"+"\n3.Check balance"+"\n4.Exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the amount to deposit");
                double Deposit = sc.nextDouble();
                acc.deposit(Deposit);
                break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    double Withdraw = sc.nextDouble();
                    acc.withdraw(Withdraw);
                    break;
                    case 3:
                        acc.display();
                        break;
                        case 4:
                            System.exit(0);
                            break;
                            default:
                                System.out.println("Invalid choice");
                                break;

        }
    }
}
