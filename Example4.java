import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        System.out.print("Введите число  ");
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String str = "" + a;
        System.out.println(a);
        int n = str.length();
        n--;
        while (str.charAt(i) == str.charAt(n) && (n != 0)) {
            i++;
            n--;
        }
        if (n == 0) {
            System.out.print("Палиндром");
        }
        else
        {
            System.out.print("не палиндром");
        }


    }
}
