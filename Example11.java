import java.util.Scanner;

public class Example11 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        if (b<a) {
            System.out.print("Ошибка! b < a");
        }
        else {
            int r = a + (int)(Math.random()*b);
            System.out.print(r);
        }
    }
}