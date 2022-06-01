import java.util.Scanner;

class FactorClass {
    FactorClass(int number)
    {
         factor(number);
    }
    void factor(int number)
    {
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
public class Q27FactorUsingConstructor
{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        FactorClass obj=new FactorClass(sc.nextInt());
    }
}