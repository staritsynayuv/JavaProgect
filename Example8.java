import java.util.Scanner;

public class Example8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n = ");
        int n = scanner.nextInt();
        Boolean p;
        int i;
        if (n == 1) {
            System.out.println("1 - не является простым числом");
        }

            p = false;
            for (i = 2; i< Math.sqrt(n); i++){
                if (n%i == 0){

                    p = true;

                }

            }
            if (p){
                System.out.println("не является простым");
            }
            else{
                System.out.println("простое");
            }
    }
}
