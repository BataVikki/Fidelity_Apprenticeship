public class InheritanceDemo {
    public static void main(String[] args) {
       Category cat=new Category();
       cat.proid=123;
       cat.proName="HP Laptop ";
       cat.proPrice=620000.00;
       cat.catid=1;
       cat.catname="Laptop";
       cat.Display();
       //cat.show();
        Brand brand=new Brand();
        brand.BrandName="HP";
        brand.Display();


    }
}
