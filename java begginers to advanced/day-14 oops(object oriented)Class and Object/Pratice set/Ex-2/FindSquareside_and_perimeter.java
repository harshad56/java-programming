
public class FindSquareside_and_perimeter {
    public static void main(String[] args) {
        /*----------------SQAURE------------------- */
        Sqaure sqaure = new Sqaure();// create a instance
        sqaure.side = 3;

        int area = sqaure.getarea();
        int perimeter = sqaure.getperimeter();
        System.out.println("Area of Square is: " + area);
        System.out.println("the perimetre is :" + perimeter);
        System.out.println("--------------------------");

        /*------------------RECTANGLE------------------- */
        Rectangle rectangle = new Rectangle();// create a instance
        rectangle.length = 5;
        rectangle.width = 4;

        rectangle.GetRectangleDetails();
    }
}

// for sqaure class
class Sqaure {
    int side;
    // it instance method

    public int getarea() {
        return side * side;
    }

    // it instance method
    public int getperimeter() {
        return 4 * side;
    }
}

// for rectangle class
class Rectangle {
    int length;
    int width;

    // it instance method
    public int getarea() {
        return length * width;
    }

    // it instance method
    public int getperimeter() {
        return 2 * (length + width);
    }

    // it instance method
    public void GetRectangleDetails() {
        System.out.println("area of rteactangle:" + getarea());
        System.out.println("the perimerter of recatngle:" + getperimeter());
    }
}
