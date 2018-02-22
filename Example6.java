import java.util.Scanner;

public class Example6 {
    public static void main(String[] args){
        double m, result, g = 9.8;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вес на Земле: ");
        m = scanner.nextDouble();
        result = m*0.17;
        System.out.print("Вес на Луне: " + result);
    }
}
