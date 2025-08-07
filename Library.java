import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + (book.isIssued() ? " [Issued]" : " [Available]"));
        }
    }

    public void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued: " + title);
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned: " + title);
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }
}
