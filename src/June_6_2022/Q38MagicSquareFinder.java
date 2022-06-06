package June_6_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Q38MagicSquareFinder {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows/columns");
        int rowsColumnsNo=scan.nextInt();
        int givenMatrix[][]=new int[rowsColumnsNo][rowsColumnsNo];
        System.out.println("Enter the elements for the matrix");
        for(int row=0;row<rowsColumnsNo;row++)
        {
            for(int column=0;column<rowsColumnsNo;column++)
            {
                givenMatrix[row][column]= scan.nextInt();
            }
        }
        ArrayList<Integer> storeAllSum=new ArrayList<>();

        for(int row=0;row<rowsColumnsNo;row++)
        {
            int sumOfRowsElements=0;
            for(int column=0;column<rowsColumnsNo;column++)
            {
                sumOfRowsElements+=givenMatrix[row][column];
            }
           storeAllSum.add(sumOfRowsElements);
        }
        for(int row=0;row<rowsColumnsNo;row++)
        {
            int sumOfColumnsElements=0;
            for(int column=0;column<rowsColumnsNo;column++)
            {
                sumOfColumnsElements+=givenMatrix[column][row];
            }
            storeAllSum.add(sumOfColumnsElements);
        }

        int forwardDiagonalSum=0;
        for(int i=0;i<rowsColumnsNo;i++)
        {
            forwardDiagonalSum+=givenMatrix[i][i];
        }
         storeAllSum.add(forwardDiagonalSum);


        int backwardDiagonalSum=0;
        for(int row=0,column=rowsColumnsNo-1;row<rowsColumnsNo && column>=0;row++,column--)
        {
            backwardDiagonalSum+=givenMatrix[row][column];
        }
        storeAllSum.add(backwardDiagonalSum);

        boolean isMagicSquare=true;
        for(int i=0;i<storeAllSum.size()-1;i++)
        {
            for(int j=i+1;j<storeAllSum.size();j++)
            {
                if(storeAllSum.get(i)!=storeAllSum.get(j))
                {
                    isMagicSquare=false;
                    break;
                }
            }
        }
        if(isMagicSquare)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
