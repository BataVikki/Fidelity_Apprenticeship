import java.util.Scanner;
class pay{
     double rate=80.0;
     int StndHours=56;
     double overtime=1.5*rate;
    public double GetGrossPay(int hoursworked)
    {

        if(hoursworked<=StndHours) {
            return hoursworked * rate;
        }
        else {
            int overtimeHours=hoursworked-StndHours;
            return (StndHours*rate)+ (overtimeHours * overtime);
        }
    }
    public double CalculateTax(double grosspay)
    {
        double taxRate=0.02;
        return grosspay*taxRate;
    }
    public double CalculateNetPay(int hoursWorked)
    {
        double grosspay=GetGrossPay(hoursWorked);
        double tax=CalculateTax(grosspay);
        return grosspay-tax;
    }
}
public class PayCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hours worked: ");
        int hoursworked = sc.nextInt();
        pay pay = new pay();
        double netpay=pay.CalculateNetPay(hoursworked);
        System.out.println("The Calculated Net pay is $"+netpay);
    }
}
