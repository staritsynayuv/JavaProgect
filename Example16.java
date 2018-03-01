import java.util.Scanner;

public class Example16 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число полок: ");
        int n = scanner.nextInt();
        int b=0;

        for(int i=1; i<=n; i++){

            String s = String.valueOf(i);
            if (s.indexOf('2') != -1) {
                b++;
            }
        }
        System.out.println("Количество бракованных табличек :  "+b);

    }
}
