import java.io.*;

interface Serilization
{

}
class products implements Serilization {
    int Id;
    String Name;
    public products(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

}
public class SerilizationExp {
    public static void main(String[] args) {
        try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("Product.txt")))
        {
            products pr=new products(1,"Milk");
            obj.writeObject(pr);
            System.out.println("Product written to file");
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    try(ObjectInputStream obj2=new ObjectInputStream
        (new FileInputStream("Product.txt")))
   {
    products pro=(products) obj2.readObject();
    System.out.println("Deserialization completed: "+"Product Id"
            +pro.Id+"Product name "+pro.Name);
   }
catch(IOException | ClassNotFoundException e)
{
    throw new RuntimeException(e);
}
}
}