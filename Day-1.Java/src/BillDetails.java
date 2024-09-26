import java.util.Scanner;

public class BillDetails{
    public static void main(String[] args)
    {
        int pizza=200,puff=40,pepsi=120;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pizzas: ");
        int No_pizza=sc.nextInt();
        System.out.println("Enter the number of puffs: ");
        int No_puffs=sc.nextInt();
        System.out.println("Enter the number of pepsi: ");
        int No_pepsi=sc.nextInt();
        int sum_pizza=pizza*No_pizza;
        int sum_puffs=puff*No_puffs;
        int sum_pepsi=pepsi*No_pepsi;
        System.out.println("The Bill Details"+"\nThe Cost Of Pizza :"+sum_pizza+" "+
                "\nThe Cost Of puffs : "+sum_puffs+" "+"\nThe Cost Of pepsi :"+sum_pepsi);
        int total_amount=sum_pizza+sum_puffs+sum_pepsi;
        System.out.println("THE TOTAL BILL AMOUNT: "+total_amount);

    }
}
