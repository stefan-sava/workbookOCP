package ch45.ex10;

import java.util.Scanner;

public class Main {
    static void main(String args[]) {
        Book b = new Book("abc", "wowTitle", "wowAUTHOR");
        Book b2 = new Book("abc", "differentTitle", "wowAUTHOR");
        Book b3 = new Book("abcd", "Title", "differentAUTHOR");
        System.out.println("Is book b1 the same as b2? " + b2.equals(b));
        System.out.println("Is book b the same as b3? " + b.equals(b3));
    }
}
