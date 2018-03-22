public class Employee extends Object {
    private String lastName;
    private String firstName;
    private String post;
    private int salary;

    public Employee(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
       // this.post = post;
       // this.salary = salary;
    }

   // public Salary(int salary) {
    //    this.salary = salary;

  //  }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public int getSalary() {
        return salary;
    }
}
