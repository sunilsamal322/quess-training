package June_6_2022;

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
            if(movies[row].rating.toLowerCase().startsWith("pg"))
            {
                pgMovies.add(movies[row]);
            }
        }
        return pgMovies;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of movies you want to add");
        int noOfMovies= Integer.parseInt(scan.nextLine());
        Movie[] movies=new Movie[noOfMovies];
        for(int movie=1;movie<=noOfMovies;movie++)
        {
            System.out.println("Enter title");
            String title=scan.nextLine();
            System.out.println("Enter studio name");
            String studio= scan.nextLine();
            System.out.println("Enter ratings");
            String rating=scan.nextLine();
            Movie film=new Movie(title,studio,rating);
            movies[movie-1]=film;
        }
        ArrayList<Movie> pgMovies=getPg(movies);
        for(Movie movie:pgMovies)
        {
            System.out.println(movie.title);
            System.out.println();
        }
    }
}
