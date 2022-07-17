/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
* */
//public class StringZigzagPattern {
//
//    static void printZigZagConcat(String str,int n)
//    {
//        if(n==1)
//        {
//            System.out.println(str+"\n");
//        }
//        String res="";
//        String[] arr=new String[n];
//        for(int i=0;i<n;i++)
//            arr[i]="";
//        boolean down=false;
//        int row=0;
//        for(int i=0;i<str.length();i++)
//        {
//            if(row>=0)
//                arr[row]+=(str.charAt(i));
//            if(row==n-1)
//                down=false;
//            if(row==0)
//                down=true;
//            if(!down)
//                row--;
//            else
//                row++;
//        }
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]);
//        }
//
//    }
//    public static void main(String[] args) {
//         String str="PAYPALISHIRING";
//         int n=3;
//         printZigZagConcat(str,n);
//    }
//}

import java.util.Scanner;

public class StringZigzagPattern {

    static String convert(String s,int numRows)
    {
        if(numRows==1)
        {
            return s;
        }
        StringBuilder result=new StringBuilder();

        int step=(2*numRows)-2;

        for(int i=0;i<numRows;i++)
        {
            for(int j=i;j<s.length();j+=step)
            {
                result.append(s.charAt(j));
                if(i!=0 && i!=numRows-1 && (j+step-2*i)<s.length())
                {
                    result.append(s.charAt(j+step-2*i));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String str=scanner.next();
        System.out.println("Enter number of rows");
        int numRows=scanner.nextInt();
        System.out.println(convert(str,numRows));
    }
}