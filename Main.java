import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book("Java Programming", "James Gosling"));
        library.addBook(new Book("Python Basics", "Guido van Rossum"));

        int choice;
        do {
            System.out.println("\n1. Show Books\n2. Issue Book\n3. Return Book\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String titleToIssue = sc.nextLine();
                    library.issueBook(titleToIssue);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = sc.nextLine();
                    library.returnBook(titleToReturn);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
