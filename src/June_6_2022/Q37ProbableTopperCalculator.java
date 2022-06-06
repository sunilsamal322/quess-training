package June_6_2022;

import java.util.Scanner;

public class Q37ProbableTopperCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the registartion number");
        int regdNumber=scan.nextInt();
        int evenDigitSum=0;
        int oddDigitSum=0;
        while (regdNumber!=0)
        {
            int currentDigit=regdNumber%10;
            if(currentDigit%2==0)
                evenDigitSum+=currentDigit;
            else if(currentDigit%2!=0)
                oddDigitSum+=currentDigit;
            regdNumber=regdNumber/10;
        }
        if(evenDigitSum==oddDigitSum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
