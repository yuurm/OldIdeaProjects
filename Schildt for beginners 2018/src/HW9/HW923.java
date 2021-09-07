package HW9;

public class HW923 {
        int a = 1;
        static int b = 2;
        void abc(int a){
            System.out.println(b);
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(HW923.b);

        }

        public static void main(String[] args) {
            HW923 t = new HW923();
            t.abc(4);
        }

    }

