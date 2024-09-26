import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product pd=new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ProductID: ");
        int PID = sc.nextInt();
        System.out.println("Enter the ProductName: ");
        String PName = sc.next();
        System.out.println("Enter the Category:: ");
        String Ctg = sc.next();
        pd.Intialize(PID,PName,Ctg);
        pd.Display();
        Product.show();

        }
    }
