import java.util.Scanner;

public class Q8GreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int greater_num=num1>num2 && num1>num3?num1:num2>num3?num2:num3;
        System.out.println("The greater number between "+num1+","+num2+" and "+num3+" is "+greater_num);
    }
}
