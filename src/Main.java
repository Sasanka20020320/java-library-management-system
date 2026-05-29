public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book(1, "Clean Code", "Robert Martin"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(3, "Java Basics", "James Gosling"));

        // Show books
        library.showBooks();

        // Borrow book
        library.borrowBook(2);
        library.borrowBook(2); // edge case

        // Return book
        library.returnBook(2);

        // Final state
        library.showBooks();
    }
}