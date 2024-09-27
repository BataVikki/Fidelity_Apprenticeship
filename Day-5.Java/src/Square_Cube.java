import java.util.Scanner;
public class Square_Cube {
    static double Square(double Num)
    {
        return Num*Num;
    }
    static double Cube(double Num)
    {
        return Num*Num*Num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Square of "+n+" is "+Square(n));
        System.out.println("The Cube of "+n+" is "+Cube(n));

    }
}
