//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


class Employee {
    int id;
    String Name;
    float BasicSalary;
    float Bonus;
    float netSalary;

    public Employee(int id, String Name, float BasicSalary) {
        this.id = id;
        this.Name = Name;
        this.BasicSalary = BasicSalary;
        this.Bonus = 0;
        this.netSalary = 0;

    }

    public void CalculateNetSlary() {
    }

    public void CalculateBonus() {

    }

    public void Display() {
        System.out.println("Employee ID:" + id);
        System.out.println("Employee Name: " + Name);
        System.out.println("Basic Salary:" + BasicSalary);
        System.out.println("Bonus:" + Bonus);
        System.out.println("netSalary :" + netSalary);

    }
}
class PermanentEmployee extends Employee {
    int pf;

    public PermanentEmployee(int id, String Name, float BasicSalary, int pf) {
        super(id, Name, BasicSalary);
        this.pf = pf;
    }

    @Override
    public void CalculateNetSlary() {
        netSalary = BasicSalary - pf;
    }

    @Override
    public void CalculateBonus() {
        super.CalculateBonus();
        if (pf < 1000) {
            Bonus = 0.10f * BasicSalary;
        } else if (pf < 1500) {
            Bonus = 0.115f * BasicSalary;
        } else if (pf < 1800) {
            Bonus = 0.12f * BasicSalary;
        } else {
            Bonus = 0.15f * BasicSalary;
        }


        public Void Display()
        {
            super.Display();
            System.out.println("PF :" + pf);
        }
    }
    class TemporaryEmployee extends Employee {
        int DailyWages;
        int NoOfDays;

        public TemporaryEmployee(int id, String Name, int DailyWage, int NoOfDays) {
            super(id, Name);
            this.DailyWages = DailyWage;
            this.NoOfDays = NoOfDays;
        }

        public void CalculateNetSalary() {
            int netSalary = DailyWages * NoOfDays;
        }

        public void CalculteBonus() {
            if (DailyWages < 1000) {
                Bonus = 0.15f * netSalary;
            } else if (DailyWages < 1500) {
                Bonus = 0.12f * BasicSalary;
            } else if (DailyWages < 1800) {
                Bonus = 0.11f * BasicSalary;
            } else {
                Bonus = 0.08f * BasicSalary;
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            PermanentEmployee PE = new PermanentEmployee(123, "vikki", 45000, 1500);
            PE.CalculateBonus();
            PE.CalculateNetSlary();
            System.out.println("------PermanantEmployee Details-----");
            PE.Display();

            TemporaryEmployee TE = new TemporaryEmployee(345, "varun", 1000, 20);
            TE.CalculateNetSalary();
            TE.CalculateBonus();
            System.out.println("Temporary Employee details: ");
            TE.Display();

        }
    }
}

