package June_6_2022;

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

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter title");
        String title=scan.next();
        System.out.println("Enter studio name");
        String studio= scan.next();
        System.out.println("Enter ratings");
        String rating=scan.next();
        Movie film=new Movie(title,studio,rating);
        Movie newFilm=new Movie(title,studio);

    }
}
