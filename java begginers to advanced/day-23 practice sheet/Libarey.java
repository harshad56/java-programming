
public class Libarey {
    String[] books;
    int no_of_books;

    public Libarey() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    public void addbooks(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " book is added");

    }

    public void showbooks() {
        for (String element : this.books) {
            if (element == null) {
                break;
            }
            System.out.println("book is:" + element);

        }

    }

    void issueBook(String book) {

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
}
