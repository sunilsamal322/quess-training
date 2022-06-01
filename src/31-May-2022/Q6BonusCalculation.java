import java.util.Scanner;

public class Q6BonusCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your basic salary");
        double basic_salaray=sc.nextDouble();
        final float TA=10f,DA=15f,HRA=20f,PF=12f;
        double bonus;
        double gross_salary;
        if(basic_salaray>=20000)
        {
            bonus=basic_salaray/10;
            gross_salary=basic_salaray+(basic_salaray*TA)/100+(basic_salaray*DA)/100+(basic_salaray*HRA)/100+bonus-(basic_salaray*PF)/100;
            System.out.println("The gross salary is "+String.format("%.2f",gross_salary));
        }
        else
        {
            bonus=(basic_salaray*20)/100;
            gross_salary=basic_salaray+(basic_salaray*TA)/100+(basic_salaray*DA)/100+(basic_salaray*HRA)/100+bonus-(basic_salaray*PF)/100;
            System.out.println("The gross salary is %.2f"+String.format("%.2f",gross_salary));
        }
    }
}
