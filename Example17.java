import java.util.Arrays;
import java.util.Collections;

public class Example17 {
    public static void main(String args[]) {
        Integer [][] a = new Integer [6][7];
        int i, k;
        for (  i = 0; i < a.length; i++) {
            for ( k = 0; k < a[i].length; k++) {
                a[i][k] = (int) (Math.random() * 10);
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }


        System.out.println("--------------");

        for (  i = 0; i < a.length; i++) {
            Arrays.sort(a[i], Collections.reverseOrder());
            for (  k = 0; k < a[i].length; k++)
                System.out.print(a[i][k] + " ");

            System.out.println();
        }

    }
}
