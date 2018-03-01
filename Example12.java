import java.util.Scanner;

public class Example12 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ведите строку ");
        String str = scanner.next();
        System.out.print("n =  ");
        int n = scanner.nextInt();

        int i;
        for (i =0; i < str.length(); i++) {
            if (i != n) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
