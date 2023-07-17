package Palindrome;

import java.util.Arrays;
import java.util.Scanner;

public class Parolapalindroma {
    public static void main(String[] args) {
        /*Consegna: scrivere un programma che chiede all’utente di inserire una parola e
        gli risponde se è una parola palindroma oppure no*/

        String word ;
        int i=0;


        Scanner yourWord= new Scanner(System.in);
        System.out.println("type a word please: ");
        word= yourWord.nextLine();
        int j= word.length()-1;

while (i<j){
    if(word.charAt(i) != word.charAt(j) ){
        System.out.println("is not a palindrome word");
     System.exit(0);
    }
    i++;
    j--;

}
        System.out.println("is  a palindrome word");
    }

}

