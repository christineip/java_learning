public class Employee extends Person {
    private static final int ID = 1;
    //constant is having fixed value
    private String title;
    private String employer;
    private String employeeGrade;
    private int salary;

    public Employee(String name) {
        //when there is a constructor called, always super class called at the beginning
        super(name);
        System.out.println("Employee Constructor");

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "employee's name: " + super.getName() + " employee's email: " + super.getEmail() + " employee's phone: " + super.getPhone() + " title:" + title + " employeeGrade: " + employeeGrade + " employer: " + employer + " salary: " + salary;
    }
}

