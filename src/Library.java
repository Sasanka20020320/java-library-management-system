import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void showBooks() {
        System.out.println("\n--- Library Books ---");
        for (Book b : books) {
            b.displayBook();
        }
    }

    public void borrowBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                b.borrowBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Book not found");
    }
}
