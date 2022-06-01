import java.util.Scanner;

public class Q7InsurancePolicy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marital status");
        String marital_status=sc.next();
        if(marital_status.equalsIgnoreCase("married"))
        {
            System.out.println("This driver is insured by the company");
        }
        else
        {
            System.out.println("Enter age");
            int age=sc.nextInt();
            System.out.println("Enter gender");
            String gender=sc.next();
            if(gender.equalsIgnoreCase("male"))
            {
                if(age>30)
                {
                    System.out.println("This driver is insured by the company");
                }
                else
                {
                    System.out.println("This driver is not insured by the company");
                }
            }
            else if(gender.equalsIgnoreCase("female"))
            {
                if(age>25)
                {
                    System.out.println("This driver is insured by the company");
                }
                else
                {
                    System.out.println("This driver is not insured by the company");
                }
            }
        }
    }
}
