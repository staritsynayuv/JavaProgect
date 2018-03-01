import java.util.Scanner;

public class Example10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;

        for(int i=0; i<=n; i++) {
            System.out.println(a[i]);
            a[i+2] = a[i] + a[i+1];



        }

    }
}