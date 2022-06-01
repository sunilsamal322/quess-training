import java.util.Scanner;

public class Q24FindPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for x");
        int x=sc.nextInt();
        System.out.println("Enter value for y");
        int y=sc.nextInt();
        Long power_result=1L;
        for(int i=1;i<=y;i++)
        {
            power_result=power_result*x;
        }
        System.out.println(x+" to the power "+y+" is "+power_result);
    }
}
