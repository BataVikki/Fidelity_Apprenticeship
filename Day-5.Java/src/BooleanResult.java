import java.util.Scanner;

public class BooleanResult {
    public static void main(String[] args) {
        int x,y;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x value: ");
        x = sc.nextInt();
        System.out.print("Enter y value: ");
        y = sc.nextInt();
        boolean result = (x < y) ? true : false;
        System.out.println("The result is X is lessthan Y is " + result);
    }
}
