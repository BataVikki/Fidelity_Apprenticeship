import java.util.Scanner;

class Calculator {
    public int Addition(int a, int b) {
        int c = a + b;
        return c;
    }

    public int Subtraction(int a, int b) {
        int c = a - b;
        return c;
    }

    public int Multiplication(int a, int b) {
        int c = a * b;
        return c;
    }

    public double Division(int a, int b)
    {
        return a/b;
    }
}
public class Calculatorprog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator c = new Calculator();
        System.out.println("Enter the operators ( +, -, *, / ) for calculations");
        String operator = sc.next();
        System.out.println("Enter the operands: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator) {
            case "+":
                System.out.println("Addition of " + a + " + " + b + " = " + c.Addition(a, b));
                break;
            case "-":
                System.out.println("Subtraction of " + a + " - " + b + " = " + c.Subtraction(a, b));
                break;
            case "*":
                System.out.println("Multiplication of " + a + " * " + b + " = " + c.Multiplication(a, b));
                break;
            case "/":
                System.out.println("Division of " + a + "/" + b + "=" + c.Division(a, b));
                break;
                default:
                    System.out.println("Invalid operator");
                    break;
        }
    }
}
