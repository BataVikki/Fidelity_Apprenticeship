import java.util.Scanner;

class ChargeException extends Exception
{
    public ChargeException(String message)
    {
        super(message);
    }

}
public class CustomExp {
    public static void main (String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the charge percentage");
            double charge = sc.nextDouble();
            if(charge >91 && charge <100)
            {
                throw new ChargeException("Charged morethan 90%");
            }
            else if(charge ==100) {
                System.out.println("Charged fully 100%");
            }
            else{
                System.out.println("Charging is lessthan 90%");
            }
        }
        catch (ChargeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

