import java.util.Scanner;

public class Q35TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no of columns");
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        System.out.println("Enter elements for array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int transposeArray[][]=new int[columns][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                transposeArray[j][i]=arr[i][j];
            }
        }
        System.out.println("Transpose matrix :-");
        for(int i=0;i<columns;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(transposeArray[i][j]+" ");
            }
            System.out.println();
        }


    }
}
