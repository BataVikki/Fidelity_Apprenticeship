import java.util.Scanner;

public class StringConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter the Last Name: ");
        String lastName = sc.nextLine();
        char ch=' ';
        String concat = firstName + ch + lastName;
        System.out.println("Full Name : "+concat);
    }
}
