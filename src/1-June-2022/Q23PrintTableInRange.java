import java.util.Scanner;

public class Q23PrintTableInRange {
    static void printTable(int number)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(number+" * "+i+" = "+number*i+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        System.out.println("Tables are printed below from 1 to "+number);
        for(int i=1;i<=number;i++)
        {
            printTable(i);
        }
    }
}
