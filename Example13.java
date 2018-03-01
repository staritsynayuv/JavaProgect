import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Example13 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:  ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        Random r = new Random();
        for(int i=0; i<a.length; i++) {
            a[i]=r.nextInt(100);
            System.out.println(a[i]);

        }
        Boolean go = true;
        while (go){
             System.out.println("1.Вывести массив");
             System.out.println("2.Уеличить элемент массива на 10%");
             System.out.println("3.Выход");
             System.out.println("4.Сортировка массива");
             System.out.print("Введите команду:  ");

             int x = scanner.nextInt();
             switch(x) {
                 case 1:

                     for(int i=0; i<a.length; i++) {
                         System.out.println(a[i]);
                     }
                     break;

                 case 2:
                     System.out.print("Введите номер элемента: ");
                     int m = scanner.nextInt();
                     a[m] *= 1.1;
                     System.out.print(a[m]);

                      break;

                 case 3:
                     go = false;
                     break;

                 case 4:
                     Arrays.sort(a);
             }

        }




    }
}
