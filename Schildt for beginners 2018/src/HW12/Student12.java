package HW12;

import Lesson11.Student;

public class Student12 {
    public String name;
    public int course;
    public double grade;

    Student12(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }



    public static void swap(Student12 s1, Student12 s2){
        Student12 s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName(Student12 s1){
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student12 st1 = new Student12("Ivan", 3, 9.2);
        Student12 st2 = new Student12("Petr", 2, 4.3);
        changeName(st2);

        StudentTest.equalMind(st1, st2);

        System.out.println(st2.name);
        /*
        swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);*/
    }

}


class StudentTest{
    public static void equalMind (Student12 st1, Student12 st2){
        if (st1.equals(st2) && st1.course == st2.course&& st1.grade == st2.grade){
            System.out.println("Studenty ravny");
        } else {System.out.println("Studenty ne ravny");}

    }

    void fullEqualMind (Student12 st1, Student12 st2){
        if(st1.name.equals(st2.name)) {
            if (st1.course==st2.course){
                if (st1.grade==st2.grade){
                    System.out.println("Studenty ravny");
                } else {System.out.println("Studenty ne ravny, raznye ocenki");}
            } else {System.out.println("Studenty ne ravny, raznye kursy");}
        } else {System.out.println("Studenty ne ravny, raznye imena");}
    }

}

