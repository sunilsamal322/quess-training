import java.util.Scanner;

public class Q31CopyArray {
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
        int copyArray[]=new int[arr.length];

        for(int i=0;i< arr.length;i++)
        {
            copyArray[i]=arr[i];
        }
        System.out.println("Copy array is");
        for(int a:copyArray)
        {
            System.out.print(a+" ");
        }
    }
}
