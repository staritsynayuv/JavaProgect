import java.util.Scanner;

public class Example5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");

        int n = scanner.nextInt();

        int a = n % 10;

        int b = (n % 100)/10;

        int c = n/100;
        int s = a + b + c;
        System.out.print("Сумма " + s );

    }
}
