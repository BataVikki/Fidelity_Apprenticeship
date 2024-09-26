import java.util.Scanner;

abstract class Shape{

    public abstract void CalculateArea();
    }

class Cylinder extends Shape {
    int r;
    int h;

    Cylinder(int r,int h) {
        this.r = r;
        this.h=h;
    }

    @Override
    public void CalculateArea() {
        System.out.println("Volume of Cylinder:" + (Math.PI * r * r*h));
    }
}
class cube extends Shape
{
    int s;
    cube(int s) {
        this.s = s;
    }

    @Override
    public void CalculateArea() {
        System.out.println("volume of cube "+s*s*s);
    }
}
public class shapes {
    public static void main(String[] args) {
        System.out.println("Enter the Shape"+" cyl for cylinder"+"  cube for cube" );
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        if(shape.equals("cyl"))
        {
            System.out.println("Enter the Radius");
            int r = sc.nextInt();
            System.out.println("Enter the Height");
            int h = sc.nextInt();
            Cylinder square = new Cylinder(r,h);
            square.CalculateArea();

        }
        else if(shape.equals("cube"))
        {
            System.out.println("Enter the Length");
            int s = sc.nextInt();
            cube c=new cube(s);
            c.CalculateArea();
        }
        else {
            System.out.println("Invaid");
        }

    }
}
