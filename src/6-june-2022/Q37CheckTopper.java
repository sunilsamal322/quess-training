import java.util.Scanner;

/* In the University Examinations conducted during the past 5 years,
 the toppers registration numbers were 7126, 82417914, 7687 and 6657.
 Your father is an expert in data mining and he could easily infer a pattern in the toppers registration numbers.
 In all the registration numbers listed here,
 the sum of the odd digits is equal to the sum of the even digits in the number.
 He termed the numbers that satisfy this property as Probable Topper Numbers.
 Write a program to find whether a given number is a probable topper number or not.
 */
public class Q37CheckTopper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number");
        int rollNumber=sc.nextInt();
        int evenDigitSum=0;
        int oddDigitSum=0;
        while (rollNumber!=0)
        {
            int currentDigit=rollNumber%10;
            if(currentDigit%2==0)
                evenDigitSum+=currentDigit;
            else if(currentDigit%2!=0)
                oddDigitSum+=currentDigit;
            rollNumber=rollNumber/10;
        }
        if(evenDigitSum==oddDigitSum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
