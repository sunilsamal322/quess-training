package june_8_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Q44HighestScoringWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any sentence");
        String stringOfWords=scan.nextLine();
        stringOfWords=stringOfWords.trim().toLowerCase(Locale.ROOT);
        int tempScoreforWord=0;
        ArrayList<Integer> scoreSaver=new ArrayList<>();
        for(int i=0;i<stringOfWords.length();i++)
        {
          if(stringOfWords.charAt(i)!=' ')

          {
              tempScoreforWord+=(int)stringOfWords.charAt(i)-96;
          }
          else
          {
            scoreSaver.add(tempScoreforWord);
            tempScoreforWord=0;
          }
        }
        scoreSaver.add(tempScoreforWord);
        int maxScoreforWord=Collections.max(scoreSaver);
        int indexPosition=scoreSaver.indexOf(maxScoreforWord);

        int spaceCount=0;
        String highScoringword="";
        for(int index=0;index<stringOfWords.length();index++)
        {
            if(spaceCount==indexPosition)
            {
                indexPosition=index;
                break;
            }
            else if(stringOfWords.charAt(index)==' ')
            {
                spaceCount++;
            }
        }
        for(int index=indexPosition;index<stringOfWords.length();index++)
        {
            highScoringword=highScoringword+stringOfWords.charAt(index);
            if(stringOfWords.charAt(index)==' ')
            {
                break;
            }
        }
        System.out.println("The highest scoring word is : "+highScoringword);
    }
}
