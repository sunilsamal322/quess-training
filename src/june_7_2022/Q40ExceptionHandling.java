package june_7_2022;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q40ExceptionHandling {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int x,y;
        System.out.println("Enter value for x");
        try {
            x = scan.nextInt();
        }
        catch (InputMismatchException e)
        {
            throw new InputMismatchException("x value should be 32 bit signed integer type only");
        }
        System.out.println("Enter value for y");
        try {
            y = scan.nextInt();
        }
        catch (InputMismatchException e)
        {
            throw new InputMismatchException("y value should be 32 bit signed integer type only");
        }
        try
        {
            int result=x/y;
            System.out.println("Division result = "+result);
        }
        catch (ArithmeticException e)
        {
            throw new ArithmeticException("can't divide with zero,y value should not be 0");
        }
    }
}
