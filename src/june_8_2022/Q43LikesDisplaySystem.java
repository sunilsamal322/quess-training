package june_8_2022;

import java.util.Scanner;

public class Q43LikesDisplaySystem {

    static void likesDispay(String[] namesList )
    {
        if(namesList.length==0)
        {
            System.out.println("No one likes this");
        }
        else if(namesList.length==1)
        {
            System.out.println(namesList[0]+" likes this");
        }
        else if(namesList.length==2)
        {
            System.out.println(namesList[0]+ " and "+namesList[1]+" like this");
        }
        else if(namesList.length==3)
        {
            System.out.println(namesList[0]+","+namesList[1]+" and "+namesList[2]+" like this");
        }
        else
        {
            System.out.println(namesList[0]+", "+namesList[1]+" and "+(namesList.length-2)+" others like this");
        }

    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many names you want to enter ?");
        int noOfNames=scan.nextInt();
        String  namesList[]=new String[noOfNames];
        if(noOfNames!=0) {
            System.out.println("Enter " + noOfNames + " names");
        }
        for(int i=0;i<noOfNames;i++)
        {
            namesList[i]= scan.next();;
        }
        likesDispay(namesList);
    }
}

