import com.sun.jdi.Value;

import java.util.Scanner;

public class ByteValue {
    public static void main(String[] args) {
        byte n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        n = sc.nextByte();
        n=Byte.MAX_VALUE;
        System.out.println("largest value stored in signed byte :"+n);

    }
}
