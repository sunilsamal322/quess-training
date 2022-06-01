import java.util.Scanner;

public class Q10MonthDayCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days");
        int no_of_days= sc.nextInt();
        int no_of_months=no_of_days/30;
        int no_of_remaining_days=no_of_days%30;
        System.out.println(no_of_days+" days can be converted into "+no_of_months+" months and "+no_of_remaining_days+" days");
    }
}
