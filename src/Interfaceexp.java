public interface Interfaceexp {
    void StudentDetails();
}
interface Collfee {
    void FeeDetails();
}
class siddarth implements Interfaceexp, Collfee {
    public void StudentDetails() {
        System.out.println("-----Student Details-----");
        String sName="vikki";
        int rollno=143;
        System.out.println("Student Name: "+sName+"\nRoll No"+rollno);
    }
    public void FeeDetails() {
        System.out.println("----Fee Details----");
        double fee=80000.00;
        System.out.println("College Fee: "+fee);
    }
public static void main (String[] args){
        Interfaceexp siddarth=new siddarth();
        siddarth.StudentDetails();
        Collfee siddarth2=new siddarth();
        siddarth2.FeeDetails();
}

}

