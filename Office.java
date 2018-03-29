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


    public void Sort(){



        //for (int i = 0; i<list.size()-1; i++){
          //  int jmin=i;
            //for (int j = i+1; j < list.size(); j++  ){
              //  if (list.get(j).getLastName().equals(list.get(jmin).getLastName())){
                //    jmin = j;
                //}
               // String x = list.get(i).getLastName();
                //String l = list.get(i).getLastName();
                //String k = list.get(jmin).getLastName();
              //  l= list.get(jmin).getLastName();
            //    k = x;
          //  }
        //}
    }


}
