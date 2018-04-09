import java.util.ArrayList;
import java.util.List;

public class Office {
    private ArrayList<Employee>  list = new ArrayList<>();


    public boolean isEmployeeInOffice(Employee employee) {
        return list.contains(employee);
    }

    public List<Employee> find(Rank rank){
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee: list){
            if (rank == employee.getRank()) {
                result.add(employee);
        }

        }
        return result;
    }

    public void showEmployeeList() {
        for (Employee element: this.list){
            System.out.print(element.getLastName() + " ");
            System.out.println(element.getFirstName());

        }
    }



    public void add(Employee employee){
        list.add(employee);
    }

    public ArrayList<Employee> getList() {
        return list ;
    }


    public void Sort() {
        for (int i = list.size()-1; i>0; i--){
            for (int j = 0; j < i; j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    Employee buf = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, buf);
                }
            }
        }


    }

}
