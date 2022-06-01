import java.util.Scanner;

public class Q3Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 3 digit numbers");
        int number=sc.nextInt();
        int reverse_number=0;
        while(number!=0)
        {
            int current_digit=number%10;
            reverse_number=reverse_number*10+current_digit;
            number=number/10;
        }
        System.out.println("Reverse number is "+reverse_number);
    }
}
