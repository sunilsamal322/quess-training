import java.util.Scanner;

public class Q15Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        Long number=sc.nextLong();
        Long factorial=1L;
        for(int i=1;i<=number;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+number+" is "+factorial);
    }
}
