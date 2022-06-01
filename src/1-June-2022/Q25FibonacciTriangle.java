import java.util.Scanner;

public class Q25FibonacciTriangle {

    static void fibonacciInTerms(int noOfTerms)
    {
        int a=1,b=1;
        if(noOfTerms==1)
        {
            System.out.print(a+" ");
            return;
        }
        if(noOfTerms==2)
        {
            System.out.print(a+" "+b+" ");
            return;
        }
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=3;i<=noOfTerms;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range for fibonacci triangle");
        int trinagleRange=sc.nextInt();
        for(int i=1;i<=trinagleRange;i++)
        {
            fibonacciInTerms(i);
            for(int j=1;j<=trinagleRange-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}