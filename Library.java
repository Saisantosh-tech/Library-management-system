
import java.util.*;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added.");
    }

    public void showBooks() {
        books.forEach(System.out::println);
    }

    public void showMembers() {
        members.forEach(System.out::println);
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && !book.isIssued()) {
                book.setIssued(true);
                System.out.println("Book issued.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && book.isIssued()) {
                book.setIssued(false);
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Invalid return.");
    }
}
