public class Example17 {
    public static void main(String args[]) {
        int[][] a = new int[6][7];
        int k, i;
        for ( i = 0; i < a.length; i++) {
            for ( k = 0; k < a[i].length; k++) {
                a[i][k] = (int) (Math.random() * 10);
                System.out.print(a[i][k] + " ");

                int max = 0, indexmax = 0;

                if (max < a[i][k]) {
                    max = a[i][k];
                    indexmax = k;
                }


                int n = a[i][0];

                a[i][0] = a[i][indexmax];

                a[i][indexmax] = n;



            }
            System.out.println(" ");

        }

        System.out.println("--------------");

        for ( i = 0; i < a.length; i++) {
            for ( k = 0; k < a[i].length; k++) {
                System.out.print(a[i][k] + " ");
            }
            System.out.println(" ");
        }

    }
}
