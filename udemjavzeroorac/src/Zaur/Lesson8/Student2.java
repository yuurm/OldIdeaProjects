package Zaur.Lesson8;

public class Student2 {
    String name;
    int course;
    static int count;
    int aa;

    public Student2(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " +
                count + " sozdan" );
    }

    public static void showCount(){
        System.out.println("Vsego sozdano " + count + " studentov");
    }

    public void showInfo(){
        System.out.println("Welcome to the Student class");
    }

    void abc(){
        aa++;
        count++;
    }

    static void abcd(){
        count++;
        Student st2 = new Student("Petr", 4);
        st2.aa++;
    }




    public static void main(String[] args) {
        abcd();
        Student st3 = new Student("Ivan", 3);
        st3.abc();
            }
}
