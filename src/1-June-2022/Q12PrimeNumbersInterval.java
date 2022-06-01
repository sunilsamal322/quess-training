import java.util.Scanner;

public class Q12PrimeNumbersInterval {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number");
        int starting_number=sc.nextInt();
        System.out.println("Enter ending number");
        int ending_number=sc.nextInt();
        for(int i=starting_number;i<=ending_number;i++)
        {
            boolean result=checkPrime(i);
            if(result==true)
            {
                System.out.print(i+" ");
            }
        }
    }
    static boolean checkPrime(int number)
    {
        boolean is_prime=true;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                is_prime=false;
                break;
            }
        }
        return is_prime;
    }
}
