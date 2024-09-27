import java.util.Scanner;

public class RegistrationPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter your Age: ");
        int Age = sc.nextInt();
        System.out.println("Enter your Country: ");
        String Country = sc.next();
        System.out.println("Welcome " +Name +
                ". Your Age is "+Age + " and Your are from " + Country);
    }
}
