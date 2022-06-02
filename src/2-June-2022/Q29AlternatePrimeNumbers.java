import java.util.Scanner;

public class Q29AlternatePrimeNumbers {

    static boolean checkPrime(int number)
    {
        boolean isPrime=true;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int given_number=sc.nextInt();
        int primeNumberCount=1;
        for(int i=2;i<=given_number;i++)
        {
          if(checkPrime(i))
          {
              if(primeNumberCount%2==1)
              {
                  System.out.print(i+" ");
              }
              primeNumberCount++;
          }
        }
    }
}
