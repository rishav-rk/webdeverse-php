//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.

class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private Book[] books;
    int bookCount;

    public Library() {
        this.books = new Book[10];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < 10) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Cannot add more books. Collection is full.");
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println("Book removed: " + books[i].getTitle());
                // Shift books to fill the gap
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null; // Set the last element to null
                bookCount--;
                return;
            }
        }
        System.out.println("Book with title " + title + " not found.");
    }

    public void displayBooks() {
        System.out.println("Books in the collection:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor() + ", ISBN: "
                    + books[i].getIsbn());
        }
    }
}

class M {
    public static void main(String[] args) {

        Library bookCollection = new Library();

        Book book1 = new Book("Days in the Sun", " Neville Cardus", "978-0-7432-7356-5");
        Book book2 = new Book("Beyond a Boundary", "CLR James", "978-0-06-112008-4");
        Book book3 = new Book("The Art of Captaincy", "Mike Brearley", "978-0-06-112008-4");

        bookCollection.addBook(book1);
        bookCollection.addBook(book2);
        bookCollection.addBook(book3);

        System.out.println("\n\n_________________________________________");
        System.out.println("Books in the Library");
        bookCollection.displayBooks();
        bookCollection.removeBook("\n\nBeyond a Boundary");

        System.out.println("\n\n_________Current Books in the library_________\n");
        bookCollection.displayBooks();
    }
}
