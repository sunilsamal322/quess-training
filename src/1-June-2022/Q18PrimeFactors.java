import java.sql.SQLType;
import java.util.Scanner;

public class Q18PrimeFactors {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        System.out.println("Prime factors are :");
        for(int i=2;i<=number/2;i++)
        {
            while (number%i==0)
            {
                System.out.print(i+" ");
                number=number/i;
            }
        }
        if(number>=2)
        {
            System.out.println(number);
        }

    }
}
