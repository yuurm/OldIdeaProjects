package HW7.otherpckge;

import HW7.Employee1;

public class EmployeeTest1other {
       public static void main(String[] args) {
            Employee1 emp1 = new Employee1(1, "Ivanov", 23,
                    100.0, "IT");
            //System.out.println(emp1.age + emp1.salary);
            //Employee1 emp2 = new Employee1(2, "Petrov");
            //System.out.println(emp2.id);
            //Employee1 emp3 = new Employee1(3, "Ivanova", 32);
           // System.out.println(emp3.surname);

            emp1.showId();
            emp1.showSalary();
            emp1.showSurname();

        }

    }
//}
