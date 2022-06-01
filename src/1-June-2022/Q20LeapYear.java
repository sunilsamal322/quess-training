import java.util.Calendar;
import java.util.Scanner;

public class Q20LeapYear {
    static void checkLeapYear(int year)
    {
        if(year%4==0 && ( year%100!=0 || year%400==0))
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        checkLeapYear(year);

    }

}
