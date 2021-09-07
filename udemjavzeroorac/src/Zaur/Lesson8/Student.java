package Zaur.Lesson8;

public class Student {
    public int a;
    String name;
    int course;
    static int count;
    public Student(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " +
                count + " sozdan" );
    }

    public static void showCount(){
        System.out.println("Vsego sozdano " + count + " studentov");
    }

}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",
                1);
        Student st2 = new Student("Petr",
                4);
        Student st3 = new Student("Masha",
                3);
        System.out.println(st1.name);
        System.out.println(Student.count);
        Student.showCount();

    }
}
