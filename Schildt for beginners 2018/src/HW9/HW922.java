package HW9;

public class HW922 {
        int a = 1;
        static int b = 2;
        static void abc(final int a){
            System.out.println(a);
            System.out.println(HW922.b);
        }

        public static void main(String[] args) {
            HW9.HW922 t = new HW9.HW922();
            abc(5);
        }

    }

