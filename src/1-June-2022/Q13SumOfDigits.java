import java.util.Scanner;

public class Q13SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int sum_of_digits=0;
        while(number!=0)
        {
            int current_digit=number%10;
            sum_of_digits=sum_of_digits+current_digit;
            number=number/10;
        }
        System.out.println("Sum of digits are "+sum_of_digits);
    }
}
