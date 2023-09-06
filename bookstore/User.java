package exercicios.exercicio_6_bookStore;

import java.util.ArrayList;
import java.util.List;

public class User {
    ArrayList<Book> userStock = new ArrayList<>();

    //private List<Book> userStock;
    private String userName;
    private String cpf;

    public void addBuyedBook(Book book){
        this.userStock.add(book);
    }
    public ArrayList<Book> userBuyedBooks(){
        return userStock;
    }
    public User(String userName, String cpf) {
        this.userName = userName;
        this.cpf = cpf;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
