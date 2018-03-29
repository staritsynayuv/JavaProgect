import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static final Office office = new Office();
    static void fill(){

        int n = in.nextInt();

        for(int i = 0; i< n; i++) {
            Employee employee = new Employee(in.next(), in.next(), Rank.valueOf(in.nextLine()) );

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


    public static void main(String[] args){
        System.out.println("Введите команду");
        String command = in.next() ;
        if (command.equals("fill")){
            fill();
        }

     //   if (command.equals("outInfo")) {
       //     outInfo();
        //}

        // Employee petrovPetr   = new Employee( "Петров",  "Пётр");
            // Employee alecseevAlex = new Employee( "Алексей", "Алексеев");

           // Employee alecseevAlex = new Employee(120000);
            //System.out.println(office.isEmployeeInOffice(petrovPetr));
            // System.out.println(office.isEmployeeInOffice(alecseevAlex));

      //  office.add(petrovPetr);
      // office.add(alecseevAlex);
      // office.Sort();
       // office.showEmployeeList();
    }

}
