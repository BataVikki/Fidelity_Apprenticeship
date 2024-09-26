package Assignment;

public class PDetails {
    private String Name;
     String Gender;
     int age;

     public void assign(String Name, String Gender, int age) {
         this.Name = Name;
         Gender = Gender;
         age = age;
     }
     public void Display() {
         System.out.println("----------Person Details---------");
         System.out.println("Name: " + Name+ "\nGender: " + Gender + "\nAge: " + age);
     }

}
