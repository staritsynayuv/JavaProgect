import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static final Office office = new Office();

    static void fill(){
        System.out.println("Количество сотрудников? ");
        int n = in.nextInt();

        for(int i = 0; i< n; i++) {
            System.out.println("Введите имя, фамилию, зарплату, должность сотрудника");
            Employee employee = new Employee(in.next(), in.next(), in.nextInt(), Rank.valueOf(in.next()) );

            office.add(employee);
        }
    }

    public static void outInfo() {
        office.showEmployeeList();
    }

    public static void find(){
        String rankName = in.next();
        Rank rank = Rank.getRank(rankName);
        if (rank == null) {
            System.out.println("Неизвестная должность" + rankName);
        }
        else {

            for (Employee employee: office.find(rank)) {
                System.out.println(employee);
            }
        }
    }

    public static void SortE() {
        office.Sort();
    }

    public static void main(String[] args){
        System.out.println("Введите команду");
        String command = in.next() ;
        if (command.equals("fill")){
            fill();
        }

       if (command.equals("outInfo")) {
            outInfo();
        }

        if (command.equals("sort")) {
            SortE();
        }

       if (command.equals("find")) {
            find();
       }




    }

}
