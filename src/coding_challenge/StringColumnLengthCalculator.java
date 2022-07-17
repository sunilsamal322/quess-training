import java.util.Scanner;

public class StringColumnLengthCalculator {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string ");
        String str=scan.next();
        int columnLengthResult=0;
        for(int index=0;index<str.length();index++)
        {
            columnLengthResult *= 26;
            columnLengthResult += (int)str.charAt(index)-64;
        }
        System.out.println(columnLengthResult);
    }
}

