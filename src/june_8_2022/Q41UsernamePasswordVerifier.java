package june_8_2022;

import java.util.Scanner;

class CustomException extends RuntimeException
{

}

public class Q41UsernamePasswordVerifier {

    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String username = scan.nextLine();
        try {

            if (!(username.charAt(0) >= 'A' && username.charAt(0) <= 'Z')) {
                throw new CustomException();
            }
        }
        catch (CustomException e)
        {
            System.out.println("Error : username must start with an uppercase English alphabet A to Z");
            return;
        }
        try{
            if (!(username.length() >= 6 && username.length() <= 15)) {
            throw new CustomException();
        }
        }
        catch(CustomException e)
        {
            System.out.println("Error : username must be of length 6-15 characters");
            return;
        }
        try
        {
            if(username.contains("(")==true || username.contains((")"))==true || username.contains(" ")==true)
            {
                throw new CustomException();
            }
        }
        catch(CustomException e)
        {
            System.out.println("Error : there cannot be any types of parentheses or whitespaces in a valid username");
            return;
        }
        System.out.println("Enter password");
        String password = scan.nextLine();
        try{
            if (!(password.length() >= 8 && password.length() <= 256))
            {
                throw new CustomException();
            }
        }
        catch(CustomException e)
        {
            System.out.println("Error: password must not be shorter than 8 characters but must not exceed 256");
            return;
        }
        try
        {
            if(password.contains("(")==true || password.contains((")"))==true || password.contains(" ")==true)
            {
            throw new CustomException();
            }
        }
        catch(CustomException e)
        {
            System.out.println("Error : there cannot be any types of parentheses or whitespaces in a valid password");
            return;
        }
        try
        {
            if (username.equalsIgnoreCase(password)) {
            throw new CustomException();
            }
        }
        catch(CustomException e)
        {
            System.out.println("Error : username or password can't be same");
            return;
        }
        System.out.println();
        System.out.println("You have successfully registered");
        System.out.println();
        System.out.println("Username : "+username);
        System.out.println("Password : "+password);
    }
}