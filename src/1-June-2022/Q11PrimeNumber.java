import java.util.Scanner;

public class Q11PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(checkPrime(number))
        {
            System.out.println(number+" is a prime number");
        }
        else
        {
            System.out.println(number+" is not a prime number");
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
