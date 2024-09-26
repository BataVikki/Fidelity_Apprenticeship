import java.util.Scanner;

public class loopexp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Mark:");
        int mark=sc.nextInt();
        if(mark>92 && mark<=100)
        {
            System.out.println("A1");
        }
        else if(mark>85 && mark<=92)
        {
            System.out.println("A");
        }
        else if(mark>75 && mark<=85)
        {
            System.out.println("B");
        }
        else if(mark>60 && mark<=75) {
            System.out.println("C");
        }
        else if(mark>50 && mark<=60) {
            System.out.println("D");
        }
        else if(mark>40 && mark<=50) {
            System.out.println("E");
        }
        else if(mark>30 && mark<=40) {
            System.out.println("F");
        }
       System.out.println("Enter the Grade: ");
        String Grade=sc.next();
        switch(Grade)
        {
            case "A1":
                System.out.println("Excellent");
                break;
                case "A":
                    System.out.println("Very Good");
                    break;
                    case "B":
                        System.out.println("Good");
                        break;
            case "C":
                System.out.println("Improvement Needed");
                break;
                case "D":
                    System.out.println("Focus More Studies");
                    break;
                    case "E":
                        System.out.println("Poor Performance");
                        break;
            default:
                System.out.println("Failed");
                break;
        }
        }
    }
