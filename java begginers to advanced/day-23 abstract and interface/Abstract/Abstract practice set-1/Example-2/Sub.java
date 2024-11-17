
public class Sub {
    public static void main(String[] args) {
        Subject x = new IT();
        x.syllabus();
        x.Learn();

        // --------------------------------//
        Subject x1 = new cs();
        x1.syllabus();
        x1.Learn();
    }
}

/*--------------------------ABSTRACT CLASS------------------ */
abstract class Subject {

    public Subject() {
        System.out.println("Learning Subject");
    }

    abstract void syllabus();

    void Learn() {
        System.out.println("Preparing Right Now!");
    }
}

// --------------------------------------//
class IT extends Subject {
    @Override
    void syllabus() {
        System.out.println("C , Java , C++");
    }
}

class cs extends Subject {
    @Override
    void syllabus() {
        System.out.println("python , Java , C");
    }
}