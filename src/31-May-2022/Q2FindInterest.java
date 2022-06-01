import java.sql.SQLOutput;
import java.util.Scanner;

public class Q2FindInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal amount");
        int principle_amount=sc.nextInt();
        System.out.println("Enter time periods in years");
        int time_in_years=sc.nextInt();
        final float rate_of_interest=7.5f;
        double simple_interest=(principle_amount*time_in_years*rate_of_interest)/100;
        double final_amount=principle_amount+simple_interest;

        System.out.println("Simple interest = "+simple_interest);
        System.out.println("Fianl amount to be paid ="+final_amount);
    }
}
