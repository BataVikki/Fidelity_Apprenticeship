import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < Size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0,avg=0;

        for (int i = 0; i < Size; i++) {
            sum=sum+arr[i];
        }
        avg=sum/Size;
        System.out.println("The average number is: "+avg);
    }

}
