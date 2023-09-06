package exercicios.exercicio_6_bookStore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> stock;
    public BookStore() {
        stock = new ArrayList<>();
    }

    public void addBook(Book book){
        stock.add(book);
    }
    public void removeBook(Book book){
        stock.remove(book);
    }
    public List<Book> showAvailableBooks(){
        return stock;
    }
    public boolean verifyDisponibility(Book book){
        return stock.contains(book);
    }

    public void buyRegisterinUser(User user, Book book){
        if(stock.contains(book)){
            user.addBuyedBook(book);
            stock.remove(book);
            System.out.println( "\n" + "Successful purchase! Ty" + "\n");
        }
        else{
            System.out.println("Book out of stock!");
        }
    }
    @Override
    public String toString() {
        return "BookStore{" +
                "stock=" + stock +
                '}';
    }
}
