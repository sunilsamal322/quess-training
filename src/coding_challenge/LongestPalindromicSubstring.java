import java.util.Scanner;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String str) {
        int start = 0, end = 0;
        for (int i = 0; i < str.length(); i++)
        {
            int len1=expandFromCentre(str,i,i+1);
            int len2=expandFromCentre(str,i,i);
            int len=Math.max(len1,len2);
            if(end-start<len)
            {
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return str.substring(start,end+1);
    }
    public static int expandFromCentre(String str,int i,int j)
    {
        while (i>=0 && j<str.length() && str.charAt(i)==str.charAt(j))
        {
            i--;
            j++;
        }
        return j-i-1;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string");
        String str=scan.next();
        System.out.println("Longest palindromic substring : "+longestPalindrome(str));
    }
}
