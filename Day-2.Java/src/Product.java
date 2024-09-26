public class Product {
    private int ProductID;
     private String ProductName;
     private String Category;
     static String OrgName="Fidelity";

     public void Intialize(int ProductID, String ProductName, String Category) {
         this.ProductID = ProductID;
         this.ProductName = ProductName;
         this.Category = Category;
     }
    public void Display()
    {
        System.out.println("Product ID: " + ProductID+"\nProductName: " + ProductName+
                "\nCategory: " + Category);

    }
    public static void show()
    {
        System.out.println("Organization Name: " + OrgName);
    }

}
