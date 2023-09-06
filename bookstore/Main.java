package exercicios.exercicio_6_bookStore;

import java.util.List;

public class Main {
    public static void main(String args[]){

        BookStore bookStore = new BookStore();

        User user1 = new User("User1", "888888");

        Book book1 = new Book("Dune", "Frank Herbert", 29.99);
        Book book2 = new Book("Neuromancer", "William Gibson", 39.99);
        Book book3 = new Book("Call of Cthulhu", "H.P. Lovecraft", 39.99);

        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);

        List<Book> availableBooks = bookStore.showAvailableBooks();
        System.out.println("Available books in store: ");
        for(Book book: availableBooks){
            System.out.println(book);
        }

        bookStore.buyRegisterinUser(user1, book1);
        bookStore.buyRegisterinUser(user1, book2);

        List<Book> buyedBooks = user1.userBuyedBooks();
        System.out.println("Buyed books from user: ");
        for(Book book : buyedBooks){
            System.out.println(book);
        }

        List<Book> availableBooks2 = bookStore.showAvailableBooks();
        System.out.println("Available books in store: ");
        for(Book book: availableBooks2){
            System.out.println(book);
        }
    }
}
