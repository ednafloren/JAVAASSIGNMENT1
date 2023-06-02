import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters and setters for the attributes

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}

class BookCollection {
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed: " + book.getTitle());
    }

    public void displayBooks() {
        System.out.println("Book Collection:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println();
        }
    }



    public static void main(String[] args) {
        // Create a book collection
        BookCollection collection = new BookCollection();

        // Create some book objects
        Book book1 = new Book("Title 1", "Author 1", "ISBN 1");
        Book book2 = new Book("Title 2", "Author 2", "ISBN 2");
        Book book3 = new Book("Title 3", "Author 3", "ISBN 3");

        // Add books to the collection
        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);

        // Display the books in the collection
        collection.displayBooks();

        // Remove a book from the collection
        collection.removeBook(book2);

        // Display the books again
        collection.displayBooks();
    }
}
