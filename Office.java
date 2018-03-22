import java.util.ArrayList;

public class Office {
    private ArrayList<Employee>  list = new ArrayList<>();

  //  public boolean isEmployeeInOffice(Employee employee) {
  //      if (list.contains(employee)) {
  //          return true;
  //      }
  //      else return false;
  //  }

    public boolean isEmployeeInOffice(Employee employee) {
        return list.contains(employee);
    }

    public void showEmployeeList() {
      //  for (int i =0; i< list.size(); i++){
      //      System.out.println(list.get(i).toString());// переделать
       // }

        for (Employee element: this.list){
            System.out.print(element.getLastName() + " ");
            System.out.println(element.getFirstName());
            System.out.println(element.getSalary());
        }

        //for (Object element: this.list){
          //  System.out.println(element);
        //}
    }

    public void add(Employee employee){
        list.add(employee);
    }

    public void Sort(){
        for (int i = 0; i<list.size()-1; i++){
            int jmin=i;
            for (int j = i+1; j < list.size(); j++  ){
                if (list.get(j).getLastName().equals(list.get(jmin).getLastName())){
                    jmin = j;
                }
                String x = list.get(i).getLastName();
                String l = list.get(i).getLastName();
                String k = list.get(jmin).getLastName();
                l= list.get(jmin).getLastName();
                k = x;
            }
        }
    }


}
