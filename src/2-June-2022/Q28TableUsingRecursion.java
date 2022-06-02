import java.util.Scanner;

public class Q28TableUsingRecursion {
    static void printTable(int number,int i)
    {
        if(10<i)
        {
            return;
        }
        System.out.println(number+" * "+i+" = "+number*i);
        printTable(number,++i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        printTable(number,1);
    }
}
