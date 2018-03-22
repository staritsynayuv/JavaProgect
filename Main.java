import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Office office = new Office();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Фамилия Имя:");
        for (int i=1; i<=3; i++) {
            String F = scanner.next();
            String N = scanner.next();
            Employee FN = new Employee(F, N);
            // Employee petrovPetr   = new Employee( "Петров",  "Пётр");
            // Employee alecseevAlex = new Employee( "Алексей", "Алексеев");
            office.add(FN);
            System.out.println(office.isEmployeeInOffice(FN));
           // Employee alecseevAlex = new Employee(120000);
            //System.out.println(office.isEmployeeInOffice(petrovPetr));
            // System.out.println(office.isEmployeeInOffice(alecseevAlex));
        }
      //  office.add(petrovPetr);
      // office.add(alecseevAlex);
        office.Sort();
       // office.showEmployeeList();
    }
}
