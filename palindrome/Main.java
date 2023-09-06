package exercicios.exercicio_5;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean option = true;
        while(option){
            System.out.println("Type the word to verify: ");
            String word = scan.nextLine();
            String newWord = word.toLowerCase();
            String inverseWord = "";
            for(int i = (newWord.length() - 1); i >= 0; i--) {
                inverseWord = inverseWord + newWord.charAt(i);
            }
            if(inverseWord.toLowerCase().equals(newWord))
                System.out.println("It is a 'palin'");
            else
                System.out.println("Is not a 'palin'");
        }
    }
}

