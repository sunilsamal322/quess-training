package hackathon.june_10_2022;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

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


        int userCurrentGameScore=0;

        HashSet<String> possibleDrawOptions=new HashSet<>();
        possibleDrawOptions.add("rock");
        possibleDrawOptions.add("paper");
        possibleDrawOptions.add("scissors");

        System.out.println("Enter s for start game and any other key for quit");
        String userWantsToPlay= scan.next().toLowerCase(Locale.ROOT);

        if(userWantsToPlay.equals("s"))
        {
            x:while (true) {
                Random random = new Random();
                int randomNumberForOpponent = random.nextInt(1, 4);

                String opponentChoice = "";

                if (randomNumberForOpponent == 1) {
                    opponentChoice = "rock";
                } else if (randomNumberForOpponent == 2) {
                    opponentChoice = "paper";
                } else if (randomNumberForOpponent == 3) {
                    opponentChoice = "scissors";
                }
            }
        }
        else
        {
            System.out.println(AppConstants.COLOR_BLUE + ">>> Thank you for playing our game <<<" + AppConstants.COLOR_RESET);
            return;
        }
    }
}
