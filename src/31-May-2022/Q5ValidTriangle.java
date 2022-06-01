import java.util.Scanner;

public class Q5ValidTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three values for the triangle");
        int first_side=sc.nextInt();
        int second_side=sc.nextInt();
        int third_side=sc.nextInt();
        if((first_side+second_side)>third_side && (first_side+third_side)>second_side && (second_side+third_side)>first_side)
        {
            System.out.println("It is a valid triangle");
        }
        else
        {
            System.out.println("It is not a valid triangle");
        }
    }
}
