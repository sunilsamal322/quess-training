import java.util.Scanner;

public class Q17PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int reverse_number=0;
        int temp_number=number;
        while(temp_number!=0)
        {
            int current_digit=temp_number%10;
            reverse_number=reverse_number*10+current_digit;
            temp_number=temp_number/10;
        }
        if(reverse_number==number)
        {
            System.out.println(number+" is a pallindrome number");
        }
        else
        {
            System.out.println(number+" is not a pallindrome number");
        }
    }
}
