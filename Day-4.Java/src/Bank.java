class Banktest {
    private String accountNumber;
    private double balance;

    public Banktest(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void Transction(int amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount " + amount + "Updated balance is " + balance);
    }

    public void Transction(int amount, boolean iswithdraw) {
        if (iswithdraw) {
            if (balance >= amount) {
                balance = balance - amount;
                System.out.println("Withdraw Amount " + amount + "Updated balance is " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public void Transction(String accountNumber, String Amount, int amount) {
        System.out.println("Transferred " + amount + " From " + Amount + " To " + accountNumber);
    }

    public void Transction() {
        System.out.println("Account Number  " + accountNumber + "\nBalance is " + balance);

    }
}
public class Bank{
    public static void main(String[] args) {
        Banktest bank = new Banktest("143v",134677);
        System.out.println("-------Bank Transcations-------");
        bank.Transction(200);
        bank.Transction(500,true);
        bank.Transction("1234345676v","13562872v",300);
        bank.Transction();
    }
}
