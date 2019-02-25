package hannahmayhew.fizzbuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Select maximum value:");
        Scanner scanner = new Scanner (System.in);
        int i = scanner.nextInt();

        for (int j = 1; j <= i; j++) {
            Boolean Fizz = false;
            Boolean Buzz = false;
            Boolean Bang = false;
            Boolean Bong = false;
            Boolean Fezz = false;
            Boolean Reverse = false;

            if (j % 3 == 0) {
                Fizz = true;
            }
            if (j % 5 == 0) {
                Buzz = true;
            }
            if (j % 7 == 0) {
                Bang = true;
            }
            if (j % 11 == 0) {
                Bong = true;
            }
            if (j % 13 == 0) {
                Fezz = true;
            }
            if (j % 17 == 0) {
                Reverse = true;
            }

            List<String> FB = new ArrayList<>();
            if (Fizz) {
                FB.add("Fizz");
            }
            if (Fezz) {
                FB.add("Fezz");
            }
            if (Buzz) {
                FB.add("Buzz");
            }
            if (Bang) {
                FB.add("Bang");
            }
            if (Bong) {
                FB.clear();
                if (Fezz) {
                    FB.add("Fezz");
                }
                FB.add("Bong");
            }
            if (Reverse) {
               Collections.reverse(FB);
            }
            if (FB.size() == 0) {
                System.out.println(j);
            } else {
                System.out.println(FB);
            }
        }
    }
}
