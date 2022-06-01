import java.util.Scanner;

public class Q16ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        int no_of_digits=0;
        int temp_variable;
        temp_variable=number;
        while (temp_variable!=0)
        {
            no_of_digits++;
            temp_variable=temp_variable/10;
        }
        temp_variable=number;
        int result_number=0;
        while (temp_variable!=0)
        {
            int current_digit=temp_variable%10;
            result_number+=Math.pow(current_digit,no_of_digits);
            temp_variable=temp_variable/10;
        }
        if(number==result_number)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }

    }
}
