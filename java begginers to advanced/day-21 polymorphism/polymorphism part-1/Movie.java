
public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchmovie() {
        String instancetype = this.getClass().getSimpleName();// getClass().getSimpleName() here java.lang object
                                                              // concept to get class name
        System.out.println(title + " is a " + instancetype + " film");
    }

    public static Movie getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new Sciencefriction(title);
            default -> new Movie(title);
        };
    }

}

/*-----------------------CHILD CLASS------------------------------------ */
class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchmovie() {
        super.watchmovie();
        System.out.printf("..%s%n".repeat(3), "pleasent scence", "scary music", "sometimes bad happen");
    }

    public void watchadventure() {
        System.out.println("watching an adventure ");
    }

}

// -------------------------------------------------------//
class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchmovie() {
        super.watchmovie();
        System.out.printf("..%s%n".repeat(3), "something happy thing happend", "happy scence in movie", "happy ending");
    }

    public void watchcomedy() {
        System.out.println("watching an comedy ");
    }

}

// -------------------------------------------------------//
class Sciencefriction extends Movie {

    public Sciencefriction(String title) {
        super(title);
    }

    @Override
    public void watchmovie() {
        super.watchmovie();
        System.out.printf("..%s%n".repeat(3), "bad eliens do bad things", "scary music", "planets blowed up");
    }

    public void watchsciencefriction() {
        System.out.println("watching an sciencefriction ");
    }

}
