import java.util.Scanner;
import java.util.Random;
public class Example14 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int l = r.nextInt(25);
        char letter = (char)(l + 97);
        Boolean game = true;
        System.out.print("Угадайте букву : ");
        while (game) {

            char n = scanner.next().charAt(0);
            if (n == letter) {
                System.out.print("Right!");
                game = false;
            }
            else if (n < letter) {
                System.out.print("You're too low ");

            }
            else if (n>letter) {
                System.out.print("You're too high ");
            }

        }
    }
}
