import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Movie movie = new Adventure("star wars");// runtime polymorphism beacuse we
        // use adventure extend from Movie
        // // class
        // movie.watchmovie();
        // System.out.println("----------------------");
        // // ----------------------------------------------------//

        // Movie movie1 = new Comedy("pewdiep");
        // movie1.watchmovie();
        // System.out.println("----------------------");
        // // ----------------------------------------------------//

        // Movie movie2 = new Sciencefriction("star fight");
        // movie2.watchmovie();
        // System.out.println("----------------------");

        // or here we can do this one line like this
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Enter type(A foe Adventure,C for Comedy and S for science friction, or you want quit Q for quit)");
            String Type = sc.nextLine();

            if (Type.equals("Q")) {
                break;
            }
            System.out.println("enter movie title:");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(Type, title);
            movie.watchmovie();
        }
    }
}
