import java.util.ArrayList;
import java.util.Scanner;

public class Q32DuplicateElement {
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
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j]) {
                    if(!al.contains(arr[i])){
                        al.add(arr[i]);
                    }
                }
            }
        }
        int duplicateCount=-al.size();
        for(int a:al)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(a==arr[i])
                {
                    duplicateCount++;
                }
            }
        }
        System.out.println("No of duplicate elements are "+duplicateCount);
    }
}
