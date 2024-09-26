//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class College {

    public void display() {
        System.out.println("Siddartha college");
    }

    public abstract void feedetails();
}
class sietk extends College {
    int rollno = 61;
    String name = "Vikki";
    double fee = 10000;

    public void feedetails() {
        System.out.println("Sietk college" + "\nName :" + name +
                "\nRollno:" + rollno + "\nFee:" + fee);
    }
}
    class sistk extends College {
        int rollno=41;
        String name="Tamil";
        double fee=15000;
        public void feedetails() {
            System.out.println("Sistk college"+"\nName :"+name+
                    "\nRollno: "+rollno+"\nFee: "+fee);
        }
    }

public class Main {
    public static void main(String[] args) {
        College col=new sietk();
        col.feedetails();
        sistk s=new sistk();
        s.feedetails();

    }
}