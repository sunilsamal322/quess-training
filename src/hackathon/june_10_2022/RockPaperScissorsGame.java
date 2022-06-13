package hackathon.june_10_2022;

import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {

        System.out.println("===================================================");
        System.out.println(AppConstants.COLOR_RED+">>>>>>>>>>ROCK-------PAPER-------SCISSORS<<<<<<<<<<"+AppConstants.COLOR_RESET);
        System.out.println("===================================================");

        System.out.println("Enter your name : ");
        Scanner scan=new Scanner(System.in);
        String userName=scan.next();

        while (true)
        {
            if(!(Character.isAlphabetic(userName.charAt(0))))
            {
                try{
                    throw new CustomException();
                }
                catch (CustomException exception)
                {
                    System.out.println(AppConstants.COLOR_RED+"Error : name must start with an english aplhabet"+AppConstants.COLOR_RESET);
                    System.out.println("Enter your name : ");
                    userName=scan.next();
                }
            }
            if(!(userName.length()>=3 && userName.length()<=10))
            {
                try
                {
                    throw new CustomException();
                }
                catch (CustomException exception)
                {
                    System.out.println(AppConstants.COLOR_RED+"Error : name must be length of 3-10 characters"+AppConstants.COLOR_RESET);
                    System.out.println("Enter your name : ");
                    userName=scan.next();
                }
            }
            else {
                break;
            }
        }
    }
}
