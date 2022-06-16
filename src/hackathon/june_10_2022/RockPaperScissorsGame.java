package hackathon.june_10_2022;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class RockPaperScissorsGame {

    private static void showLeaderBoard()
    {
        try(FileInputStream fileInputStream = new FileInputStream(AppConstants.filePath))
        {
            Properties properties=new Properties();
            properties.load(fileInputStream);
            int highestScoreInLeaderboard=0;
            String playerName="";

            for(String player : properties.stringPropertyNames())
            {
                int playerScore=Integer.parseInt(properties.getProperty(player));
                if(playerScore>highestScoreInLeaderboard)
                {
                    highestScoreInLeaderboard=playerScore;
                    playerName=player;
                }
            }
            if(playerName.equals("") && highestScoreInLeaderboard!=0) {

                System.out.println(AppConstants.COLOR_BLUE + "Top Scorer in the game " + AppConstants.COLOR_RESET);
                System.out.println(AppConstants.COLOR_YELLOW + "Name : " + playerName +AppConstants.COLOR_RESET);
                System.out.println(AppConstants.COLOR_YELLOW + "Score : " + highestScoreInLeaderboard + AppConstants.COLOR_RESET);
                System.out.println(AppConstants.COLOR_CYAN + "------------------------------------------" + AppConstants.COLOR_RESET);
            }
        }
        catch (IOException exception)
        {
            //   System.out.println(COLOR_RED+"Something went wrong !unable to fetch data from leaderboard "+COLOR_RESET);
        }
    }

    public static void main(String[] args) {

        System.out.println("===================================================");
        System.out.println(AppConstants.COLOR_RED+">>>>>>>>>>ROCK-------PAPER-------SCISSORS<<<<<<<<<<"+AppConstants.COLOR_RESET);
        System.out.println("===================================================");

        showLeaderBoard();

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

        String userHighestScoreInString=null;
        int userHighestScore=0;

        Properties properties=new Properties();

        try(FileInputStream fileInputStream = new FileInputStream(AppConstants.filePath))
        {
            properties.load(fileInputStream);
            userHighestScoreInString=properties.getProperty(userName);

            if(userHighestScoreInString!=null)
            {
                userHighestScore=Integer.parseInt(userHighestScoreInString);
                System.out.println(AppConstants.COLOR_BLUE+"Your high score is "+userHighestScore+AppConstants.COLOR_RESET);
                System.out.println(AppConstants.COLOR_YELLOW+"Welcome back, "+userName+AppConstants.COLOR_RESET);
            }
            else {
                System.out.println(AppConstants.COLOR_YELLOW+"Welcome, "+userName+AppConstants.COLOR_RESET);
            }
        }
        catch (IOException exception)
        {
            System.out.println(AppConstants.COLOR_YELLOW+"Welcome, "+userName+AppConstants.COLOR_RESET);
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

                System.out.println("Choose one option from these 3 options Rock Paper Scissors");
                String userChoice=scan.next().trim().toLowerCase();

                if(userChoice.equals(opponentChoice))
                {
                    System.out.println(AppConstants.COLOR_PURPLE+"Opponent choose "+opponentChoice+AppConstants.COLOR_RESET);
                    System.out.println(AppConstants.COLOR_BLUE+"You Choose "+userChoice+AppConstants.COLOR_RESET);
                    System.out.println(AppConstants.COLOR_CYAN+"Result : It is a draw"+AppConstants.COLOR_RESET);
                }
                else if((userChoice.equals("rock") && opponentChoice.equals("scissors")) || (userChoice.equals("scissors") && opponentChoice.equals("paper"))
                        || (userChoice.equals("paper") && opponentChoice.equals("rock")))
                {
                    userCurrentGameScore+=10;
                    System.out.println(AppConstants.COLOR_PURPLE+"Opponent choose "+opponentChoice+AppConstants.COLOR_RESET);
                    System.out.println(AppConstants.COLOR_BLUE+"You Choose "+userChoice+AppConstants.COLOR_RESET);
                    System.out.println(AppConstants.COLOR_YELLOW+"Result : You win"+AppConstants.COLOR_RESET);
                }
                else if(!possibleDrawOptions.contains(userChoice))
                {
                    System.out.println(AppConstants.COLOR_RED+"your move is not valid"+AppConstants.COLOR_RESET);
                    continue x;
                }
                else {
                    System.out.println(AppConstants.COLOR_PURPLE+"Opponent choose "+opponentChoice+AppConstants.COLOR_RESET);
                    System.out.println(AppConstants.COLOR_BLUE+"You Choose "+userChoice+AppConstants.COLOR_RESET);
                    System.out.println(AppConstants.COLOR_RED+"Result : You lost"+AppConstants.COLOR_RESET);
                }

                System.out.println("Do you want to continue? Enter Y for Yes | N for No");
                String userOption= scan.next().toLowerCase().trim();
                if(userOption.equals("n")){
                    break;
                }
                else if(!userOption.equals("y")) {
                    System.out.println(AppConstants.COLOR_RED + "You choose invalid option,Please Enter Y for Yes | N for No" + AppConstants.COLOR_RESET);
                    boolean userWantToExit = false;
                    while (true) {
                        userOption = scan.next().trim().toLowerCase();
                        if (userOption.equals("n")) {
                            userWantToExit = true;
                            break;
                        } else if (userOption.equals("y")) {
                            break;
                        } else {
                            System.out.println(AppConstants.COLOR_RED + "You choose invalid option,Please Enter Y for Yes | N for No" + AppConstants.COLOR_RESET);
                        }
                    }
                    if (userWantToExit) {
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println(AppConstants.COLOR_BLUE + ">>> Thank you for playing our game <<<" + AppConstants.COLOR_RESET);
            return;
        }

        if(userHighestScoreInString==null)
        {
            if(userCurrentGameScore>0)
            {
                System.out.println(AppConstants.COLOR_YELLOW+"Congratulations, your new high score is "+userCurrentGameScore+AppConstants.COLOR_RESET);
                try(FileOutputStream fileOutputStream = new FileOutputStream(AppConstants.filePath)) {
                    properties.setProperty(userName,String.valueOf(userCurrentGameScore));
                    properties.store(fileOutputStream,null);
                }
                catch (IOException exception)
                {
                    System.out.println(AppConstants.COLOR_RED+"Something went wrong! We can't able to save your score"+AppConstants.COLOR_RESET);
                }
            }
            else
            {
                System.out.println(AppConstants.COLOR_YELLOW+"Your score "+userCurrentGameScore+AppConstants.COLOR_RESET);
            }
        }
        else
        {
            if(userCurrentGameScore>userHighestScore)
            {
                System.out.println(AppConstants.COLOR_CYAN+"Your score "+userCurrentGameScore+AppConstants.COLOR_RESET);
                System.out.println(AppConstants.COLOR_YELLOW+"Congratulations, your new high score is "+userCurrentGameScore+AppConstants.COLOR_RESET);
                try(FileOutputStream fileOutputStream=new FileOutputStream(AppConstants.filePath))
                {
                    properties.setProperty(userName,String.valueOf(userCurrentGameScore));
                    properties.store(fileOutputStream,null);
                }
                catch (IOException exception)
                {
                    System.out.println(AppConstants.COLOR_RED+"Something went wrong! We can't able to save your score"+AppConstants.COLOR_RESET);
                }
            }
            else
            {
                System.out.println(AppConstants.COLOR_YELLOW+"Your score "+userCurrentGameScore+AppConstants.COLOR_RESET);
            }
        }
        System.out.println(AppConstants.COLOR_BLUE+">>> Thank you for playing our game <<<"+AppConstants.COLOR_RESET);
    }
}
