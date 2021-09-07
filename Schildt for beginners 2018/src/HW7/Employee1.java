package HW7;


public class Employee1 {
    protected int id;
    public String surname;
    int age;
    private double salary;
    String department;

    Employee1(int id2, String surname2, int age2) {
        this (id2,surname2,age2,0.0,null);
    }

    private Employee1(int id2, String surname2) {
        this (id2,surname2,0,0.0,null);
    }

    public Employee1 (int id4, String surname4, int age4, double salary4,
             String department4) {
        id=id4;
        surname = surname4;
        age=age4;
        salary=salary4;
        department=department4;
    }

    public void showId() {
        System.out.println("nomer sotrudnika: " + id);
    }

    public void showSurname() {
        System.out.println("familiya sotrudnika: " + surname);
    }

    public void showSalary() {
        System.out.println("zp sotrudnika: " + salary);
    }


}

class EmployeeTest1{
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(1, "Ivanov", 23,
                100.0, "IT");
        System.out.println(emp1.age);
        //Employee1 emp2 = new Employee1(2, "Petrov");
        //System.out.println(emp2.id);
        Employee1 emp3 = new Employee1(3, "Ivanova", 32);
        System.out.println(emp3.surname);

    }

}


