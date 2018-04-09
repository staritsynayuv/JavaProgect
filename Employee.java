public class Employee extends Object implements Comparable  {
    private String lastName;
    private String firstName;
    private int salary;
    private Rank rank;


    public Employee(String lastName, String firstName, int salary , Rank rank){
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.rank = rank;


    }




   // public Salary(int salary) {
    //    this.salary = salary;

  //  }
    public Rank getRank() {
        return rank;
    }

    public String getLastName() {
        return lastName;
    }



    public String getFirstName() {
        return firstName;
    }


    public int getSalary() {
        return salary;
    }



    public void fill(String s1, String s2, int salary, Rank rank) {
        this.firstName = s1;
        this.lastName = s2;
        this.salary = salary;
        this.rank = rank;

    }



    public String toString() {
        return lastName + "  " + firstName + "  " + rank;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee second = (Employee) o;

          if(this.lastName.compareTo(second.getLastName()) == 0){

                return this.salary - second.getSalary();
            }
            else {
              return this.lastName.compareTo(second.getLastName());
          }

        }
       return 1;
    }
}
