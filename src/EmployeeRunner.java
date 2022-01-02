public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Chris");
        employee.setEmployer("LKK");
        employee.setEmployeeGrade("A");
        employee.setSalary(1000);
        employee.setTitle("AM");
        employee.setEmail("java.havefun@lkk.com");
        employee.setPhone(44443333);
        String value = employee.toString();
        System.out.println(value);
    }
}
