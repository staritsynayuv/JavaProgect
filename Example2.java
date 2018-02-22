import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        int c = a % b;
        int result = a/b;
        System.out.println( a + "/" + b + "=" + result + " в остатке" + c  );
    }
}
