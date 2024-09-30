import java.awt.geom.Arc2D;
import java.util.Scanner;

class Insurance{
    private String insuranceNo;
    private String insuranceName;
    private Double amountCovered;
    public String getInsuranceNo() {
        return insuranceNo;
    }
    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;

    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public double getAmountCovered() {
        return amountCovered;
    }
    public void setAmountCovered(Double amountCovered) {
        this.amountCovered = amountCovered;
    }
}
class MotorInsurance extends Insurance{
    private double idv;
    private float depPercent;
    public double getIdv() {
        return idv;
    }
    public void setIdv(Double idv) {
        this.idv = idv;
    }
    public float getDepPercent() {
        return depPercent;
    }
    public void setDepPercent(float depPercent) {
        this.depPercent = depPercent;
    }
    public double calculatePremium()
    {
        idv=getAmountCovered()-((getAmountCovered()*depPercent)/100);
        return idv*0.03;
    }

}
class LifeInsurance extends Insurance{
    private int policyTerm;
    private float benefitPercent;

    public int getPolicyTerm() {
        return policyTerm;
    }
    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    public void setBenefitPercent(float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }
    public float getBenefitPercent() {
        return benefitPercent;
    }
    public Double calculatePremium()
    {
        return (getAmountCovered()-((getAmountCovered()*benefitPercent)/100))/policyTerm;
    }
}

public class InsuranceCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Insurance No: ");
        String insuranceNo = sc.nextLine();
        System.out.println("Enter Insurance Name: ");
        String insuranceName = sc.nextLine();
        System.out.println("Enter Insurance Amount: ");
        Double amountCovered = sc.nextDouble();
        System.out.println("Select Policy Option: ");
        System.out.println("1. life Insurance "+"\n 2. Motor Insurance ");
        int Option = sc.nextInt();
        if (Option == 1) {
            LifeInsurance lifeInsurance = new LifeInsurance();
            lifeInsurance.setInsuranceNo(insuranceNo);
            lifeInsurance.setInsuranceName(insuranceName);
            lifeInsurance.setAmountCovered(amountCovered);
            System.out.println("Policy Term");
            lifeInsurance.setPolicyTerm(sc.nextInt());
            System.out.println("Benefit Percent");
            lifeInsurance.setBenefitPercent(sc.nextFloat());
            double premium = addPolicy(lifeInsurance);
            System.out.println("The calculated premium " + premium);

        } else if (Option == 2) {
            MotorInsurance motorInsurance = new MotorInsurance();
            motorInsurance.setInsuranceNo(insuranceNo);
            motorInsurance.setInsuranceName(insuranceName);
            motorInsurance.setAmountCovered(amountCovered);
            System.out.println("Deprication percentage ");
            motorInsurance.setDepPercent(sc.nextFloat());
            Double premium = addPolicy(motorInsurance);
            System.out.println("The calculated premium " + premium);
        } else {
            System.out.println("Invalid option");

        }
        sc.close();
    }
             public static Double addPolicy(Insurance ins)
        {
            if(ins instanceof LifeInsurance)
            {
                return ((LifeInsurance)ins).calculatePremium();
            }
            else if(ins instanceof MotorInsurance)
            {
                return ((MotorInsurance)ins).calculatePremium();
            }
            return 0.0;
        }

    }

