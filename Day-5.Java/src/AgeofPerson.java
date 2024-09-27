import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private LocalDate DOB;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return DOB;
    }

    public void setDob(LocalDate dob) {
        this.DOB = dob;
    }

    public String getAdult() {
        return getAge(DOB) >= 18 ? "Adult" : "Child"; //ternary operator
    }

    public int getAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - dob.getYear() - (currentDate.getDayOfYear() < dob.getDayOfYear() ? 1 : 0);
    }

    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + getAge(DOB));
        System.out.println(getAdult());
    }
}

public class AgeofPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter first name: ");
        person.setFirstName(scanner.nextLine());

        System.out.print("Enter last name: ");
        person.setLastName(scanner.nextLine());

        LocalDate dob = null;
        boolean validDate = false;

        while (!validDate) {
            System.out.print("Enter date of birth in yyyy/MM/dd format: ");
            String dobInput = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

            try {
                dob = LocalDate.parse(dobInput, formatter);
                validDate = true;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy/MM/dd.");
            }
        }

        person.setDob(dob);

        person.displayDetails();

    }
}