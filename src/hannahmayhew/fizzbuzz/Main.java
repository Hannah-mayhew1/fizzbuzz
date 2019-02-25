package hannahmayhew.fizzbuzz;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {
            Boolean Fizz = false;
            Boolean Buzz = false;
            Boolean Bang = false;
            Boolean Bong = false;
            Boolean Fezz = false;
            Boolean Reverse = false;

            if (i % 3 == 0) {
                Fizz = true;
            }
            if (i % 5 == 0) {
                Buzz = true;
            }
            if (i % 7 == 0) {
                Bang = true;
            }
            if (i % 11 == 0) {
                Bong = true;
            }
            if (i % 13 == 0) {
                Fezz = true;
            }
            if (i % 17 == 0) {
                Reverse = true;
            }

            StringBuilder build = new StringBuilder();
            if (Fizz) {
                build.append("Fizz");
            }
            if (Buzz) {
                build.append("Buzz");
            }
            if (Bang) {
                build.append("Bang");
            }
            if (Bong) {
                build.replace(0, build.length(), "Bong");
            }
            if (Fezz) {
                if (build.indexOf("B") != -1) {
                    build.insert(build.indexOf("B"), "Fezz");
                } else {
                    build.append("Fezz");
                }
            }
            if (Reverse) {
                build.reverse();
            }

            if (build.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(build);
                }
            }
        }
}
