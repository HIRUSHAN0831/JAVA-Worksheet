package LW_03;
import java.util.ArrayList;


abstract class BorrowableItems {
    public abstract void displayInfo();
}

class Book extends BorrowableItems {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;


    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student1 extends Person {
    public Student1(String name) {
        super(name);
    }
}

class Library {
    private ArrayList<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equalsIgnoreCase(title)) {
                    if (book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("You have checked out \"" + title + "\".");
                    } else {
                        System.out.println("Sorry, \"" + title + "\" is already checked out.");
                    }
                    return;
                }
            }
        }
        System.out.println("Book titled \"" + title + "\" not found in library.");
    }

    public void listAvailableItems() {
        System.out.println("\n--- Available Library Items ---");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }

    public void displayLibraryInfo() {
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                if (((Book) item).isAvailable()) {
                    availableCount++;
                }
            }
        }
        System.out.println("Total items in library: " + borrowableItemsList.size());
        System.out.println("Available items: " + availableCount);
    }
}

public class Q05 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Madol Duuwa", "Martin Wickramasighe", "9789553023975", true);
        Book book2 = new Book("Harry Potter", "JK Rowling", "9789553548721", true);
        Book book3 = new Book("Load of the Ring", "J.R.R. Tolkien", "9781616953623", true);

        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        System.out.println("===== Library Information =====");
        library.displayLibraryInfo();

        library.listAvailableItems();

        System.out.println("\n--- Checking out a book ---");
        library.checkoutItem("Island of a Thousand Mirrors");

        library.listAvailableItems();

        System.out.println("\n===== Updated Library Information =====");
        library.displayLibraryInfo();
    }
}
