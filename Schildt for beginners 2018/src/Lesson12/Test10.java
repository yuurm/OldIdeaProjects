package Lesson12;

public class Test10 {
    public static void main(String[] args) {
        int salary = 300;

        if (salary<200){
            System.out.println("Z/P ochen nizka");
        } else if (salary <400) {
            System.out.println("Z/P srednego razmera");
        } else if (salary > 600) {
            System.out.println("Z/P vysokaya");
        } else
            System.out.println("Z/P otlichnaya");
    }
}
