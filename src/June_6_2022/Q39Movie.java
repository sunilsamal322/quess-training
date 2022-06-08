package June_6_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Q39Movie {

    private String title;
    private String studio;
    private String rating;

    Q39Movie(String title, String studio, String rating)
    {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Q39Movie(String title, String studio)
    {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    static ArrayList<Q39Movie> getPg(Q39Movie[] movies)
    {
        ArrayList<Q39Movie> pgMovies=new ArrayList<>();

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
        Q39Movie[] movies=new Q39Movie[noOfMovies];
        for(int movie=1;movie<=noOfMovies;movie++)
        {
            System.out.println("Enter title");
            String title=scan.nextLine();
            System.out.println("Enter studio name");
            String studio= scan.nextLine();
            System.out.println("Enter ratings");
            String rating=scan.nextLine();
            Q39Movie film=new Q39Movie(title,studio,rating);
            movies[movie-1]=film;
        }
        ArrayList<Q39Movie> pgMovies=getPg(movies);
        for(Q39Movie movie:pgMovies)
        {
            System.out.println(movie.title);
            System.out.println();
        }
    }
}
