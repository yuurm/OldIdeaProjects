package HW6;


public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;

    public Student(){
       }

    Student(int studentId2, String name2, String surname2,
            int course2){
        this (studentId2, name2, surname2, course2, 0.0,
                0.0, 0.0);
    }


    Student(int studentId1, String name1, String surname1,
            int course1, double mathAverageGrade1,
                    double economicsAverageGrade1,
                    double foreignLanguageAverageGrade1){
        studentId=studentId1;
        name = name1;
        surname = surname1;
        course=course1;
        mathAverageGrade = mathAverageGrade1;
        economicsAverageGrade = economicsAverageGrade1;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade1;
    }
}


class StudentTest {

    public static void main(String[] args) {

        Student std1 = new Student(1, "Gogen",
                "Ivanov", 1,
                100.0, 80.0, 90.0);
        System.out.println(std1.name);

        Student std2 = new Student(2, "Jurgen",
                "Ivanoff", 1);
        System.out.println(std2.name);

        Student std3 = new Student();
        System.out.println(std3.name);
    }





}