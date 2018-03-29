public class Employee extends Object {
    private String lastName;
    private String firstName;
    private Rank rank;
    private int salary;

    public Employee(String lastName, String firstName, Rank rank){
        this.lastName = lastName;
        this.firstName = firstName;
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
}

