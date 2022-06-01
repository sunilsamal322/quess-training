import java.util.Scanner;

public class Q26FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int givenTerm=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci series are :");
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=givenTerm-2;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
