

class Automobile
{
    String Product="vehicle";
    public void Display()
    {
        System.out.println("Product Type: "+Product);
    }

}
class car extends Automobile
{
    String vName="TATA";
    int carNo=143;
    public void Display()
    {
        System.out.println("Car Details");
        System.out.println("Product Type : "+Product+
                "\nVehicle Name: "+vName+
                "\n Car No: "+carNo);
        super.Display();

    }
}
class Bike extends Automobile
{
    public void Display()
    {
        String Vname="Bike";
        int Vnum=134;
        System.out.println("Product_Type: "+Product+"\nVehicle Name: "+Vname
                +"\nVehicle Number: "+Vnum);
        super.Display();
    }

}
public class Hirerarchical {

    public static void main(String[] args) {
        Bike b=new Bike();
        car c=new car();
        c.Display();
        b.Display();


    }
}
