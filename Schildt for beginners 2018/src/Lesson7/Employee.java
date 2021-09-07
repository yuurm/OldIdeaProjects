package Lesson7;

public class Employee {
    public double salary;
    public void doubleSalary(){
        System.out.println("New salary: " + salary*2);
    }
    public Employee (double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}
