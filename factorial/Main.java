package exercicios.exercicio_4;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number to factor: ");
        int n = scan.nextInt();
        long factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        System.out.println("Factor of "+ n + " is " + factorial);
    }
}
