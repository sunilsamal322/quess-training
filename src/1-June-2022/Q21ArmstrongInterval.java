import java.util.Scanner;

public class Q21ArmstrongInterval {

    static boolean checkArmstrongNumber(int number)
    {
        int temp_var=number;
        int total_digits=0;
        while (temp_var!=0)
        {
            temp_var=temp_var/10;
            total_digits++;
        }
        temp_var=number;
        int sumOfResult=0;
        while (temp_var!=0)
        {
            int currentDigit=temp_var%10;
            sumOfResult+=Math.pow(currentDigit,total_digits);
            temp_var=temp_var/10;
        }
        if(number==sumOfResult)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number");
        int startNumber=sc.nextInt();
        System.out.println("Enter ending number");
        int endNumber=sc.nextInt();
        System.out.println("Armstrong numbers are:");
        for(int i=startNumber;i<=endNumber;i++)
        {
            if(checkArmstrongNumber(i))
                System.out.print(i+" ");
        }
    }
}
