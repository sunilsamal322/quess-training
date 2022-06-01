import java.util.Scanner;

public class Q4FirstLastDigit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String number_in_str=sc.next();
        char[] number_in_ch=number_in_str.toCharArray();
        int first_digit=Integer.parseInt(String.valueOf(number_in_ch[0]));
        int last_digit=Integer.parseInt(String.valueOf(number_in_ch[number_in_ch.length-1]));
        int final_sum=first_digit+last_digit;
        System.out.println("Sum of first and last digit of number "+number_in_str+" is = "+final_sum);
    }
}