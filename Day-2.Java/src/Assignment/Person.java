package Assignment;

import java.util.Scanner;

public class Person {
public static void main(String[] args) {

        PDetails pd = new PDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        pd.age = age;
        pd.Gender = gender;

        pd.assign(name,gender,age);
        pd.Display();
    }
}