import java.util.Scanner;

public class Q30ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements for array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Reverse array is");
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
