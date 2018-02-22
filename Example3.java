import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Boolean [][] days  = new Boolean [7][2];

        //Понедельник
        days[0][0] = true; // будний день
        days[0][1] = true; // отпуск

        //Вторник
        days[1][1] = false;
        days[1][0] = true;

        //Среда
        days[2][0] = true;
        days[2][1] = true;

        //Четверг
        days[3][1] = true;
        days[3][0] = true;

        //Пятница
        days[4][0] = true;
        days[4][1] = false;

        //Суббота
        days[5][1] = false;
        days[5][0] = false;

        //Воскресенье
        days[6][0] = false;
        days[6][1] = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Номер дня недели: ");
        int a = scanner.nextInt();

        if (!(days[a-1][0]) || (days[a-1][1])) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }
}
