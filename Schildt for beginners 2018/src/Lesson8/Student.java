package Lesson8;

public class Student {
    String name;
   int course;
   static int count;
   int a;

   public Student (String name2, int course2){
       count++;
       name = name2;
       course = course2;

       System.out.println("Student  - " + count + " sozdan");

   }

   public static void showCount(){
       System.out.println("Vsego sozdano studentov: " + count);
   }

   public void showInfo(){
       System.out.println("Welcome to the Student class!");
   }

   void abc(){
       a++;
       count++;
   }

   static void aabcd(){
       //a++;
       count++;
       Student student2 = new Student("Zahar", 3);
       student2.a++;
   }



    public static void main(String[] args) {
       aabcd();
       //abc();
        Student student3 = new Student("Zhorzh", 3);
        student3.abc();
    }

}
