package June_6_2022;

/*
Req3:Write a method getPg, which takes an array of base type Movie as its argument,
and returns a new array of only those movies in the input array with a rating of “PG”.
You may assume that the input array is full of Movie instances.
The returned array need not be full.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    Movie(String title,String studio,String rating)
    {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title,String studio)
    {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    static ArrayList<Movie> getPg(Movie[] movies)
    {
        ArrayList<Movie> pgMovies=new ArrayList<>();

        for(int row=0;row< movies.length;row++)
        {
            if(movies[row].rating=="PG")
            {
                pgMovies.add(movies[row]);
            }
        }
        return pgMovies;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter title");
        String title=scan.next();
        System.out.println("Enter studio name");
        String studio= scan.next();
        System.out.println("Enter ratings");
        String rating=scan.next();
        Movie film=new Movie(title,studio,rating);


    }
}
