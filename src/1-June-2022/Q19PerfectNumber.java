import java.util.Scanner;

public class Q19PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int sumOfDivisors=0;
        for(int i=1;i<=number/2;i++)
        {
            if(number%i==0)
            {
                sumOfDivisors+=i;
            }
        }
        if(sumOfDivisors==number)
        {
            System.out.println(number+" is a perfect number");
        }
        else
        {
            System.out.println(number+" is not a perfect number");
        }
    }
}
