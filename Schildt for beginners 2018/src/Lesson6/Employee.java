package Lesson6;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id2, String surname2, int age2){
        this (id2,surname2,age2,0.0,null);
        }

    Employee(int id4, String surname4, int age4, double salary4,
             String department4){
        id=id4;
        surname = surname4;
        age=age4;
        salary=salary4;
        department=department4;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 23,
                100.0, "IT");
        System.out.println(emp1.age);

    }

}