package Lesson9;

public class Student {
    public static int c = 5;
    public int z = this.c;

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;
        st1 = null;
        st1 = new Student();
        String s = "privet!";
    }
}