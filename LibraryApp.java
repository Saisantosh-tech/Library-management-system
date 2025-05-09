
import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book\n2. Add Member\n3. Show Books\n4. Show Members\n5. Issue Book\n6. Return Book\n7. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID, Title, Author: ");
                    int id = sc.nextInt();
                    String title = sc.next();
                    String author = sc.next();
                    library.addBook(new Book(id, title, author));
                }
                case 2 -> {
                    System.out.print("Enter Member ID, Name: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    library.addMember(new Member(id, name));
                }
                case 3 ->
                    library.showBooks();
                case 4 ->
                    library.showMembers();
                case 5 -> {
                    System.out.print("Enter Book ID to issue: ");
                    int id = sc.nextInt();
                    library.issueBook(id);
                }
                case 6 -> {
                    System.out.print("Enter Book ID to return: ");
                    int id = sc.nextInt();
                    library.returnBook(id);
                }
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default ->
                    System.out.println("Invalid option.");
            }
        }
    }
}
