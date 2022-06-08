package june_8_2022;

import java.util.Scanner;

public class Q42StringWithDigitsReplacer {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string of digits");
        String stringOfDigits= scan.nextLine();
        char[] stringOfDigitsToChar=stringOfDigits.toCharArray();
        for(int i=0;i< stringOfDigitsToChar.length;i++)
        {
            if(Integer.parseInt(String.valueOf(stringOfDigitsToChar[i]))<5)
            {
                stringOfDigitsToChar[i]='0';
            }
            if(Integer.parseInt(String.valueOf(stringOfDigitsToChar[i]))>=5)
            {
                stringOfDigitsToChar[i]='1';
            }
        }
        stringOfDigits=new String(stringOfDigitsToChar);
        System.out.println("The string after replacing with 0 and 1 is : ");
        System.out.println(stringOfDigits);
    }
}
