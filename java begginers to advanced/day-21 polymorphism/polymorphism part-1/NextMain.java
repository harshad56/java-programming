// class casting,and using object and var reference,instance of
public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "yuo");
        movie.watchmovie();
        System.out.println("-------------");

        // -----------------------------------------------------------//
        // 1)
        Adventure jaw = (Adventure) Movie.getMovie("A", "jaws");// here we cast the class
        jaw.watchmovie();
        System.out.println("-------------");

        // -----------------------------------------------------------//
        // 2)
        // new concept using var reference
        var airplane = (Comedy) Movie.getMovie("C", "Airplane");
        airplane.watchmovie();
        airplane.watchcomedy();

        var plane = new Comedy("plane");
        plane.watchcomedy();
        System.out.println("------------------------------");
        // -------------------------------------------------------------
        // 3
        // checking the runtime type using the instanceof operator
        Object unknownObject = Movie.getMovie("C", "gigo");

        if (unknownObject instanceof Comedy) {
            ((Comedy) unknownObject).watchcomedy();

        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchadventure();

        } else if (unknownObject instanceof Sciencefriction) {
            ((Sciencefriction) unknownObject).watchsciencefriction();
        }

    }
}
