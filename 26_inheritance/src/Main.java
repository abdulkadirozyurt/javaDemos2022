
public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        customer.id = 1;
        customer.firstName = "Abdulkadir";
        customer.lastName = "Ozyurt";
        customer.age = 21;
        customer.email = "abc@gmail.com";

        employee.id = 2;
        employee.firstName = "Emirhan";
        employee.lastName = "Cibir";
        employee.age = 22;
        employee.salary = 8000;


        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.List();
        employeeManager.Add();
        employeeManager.BestEmployee();
    }

}
