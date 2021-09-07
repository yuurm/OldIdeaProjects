package HW8;

public class HW81 {
    int a;
    int b;
    int c;
    static double  multiply(double a1, double a2, double a3){
        double summa = a1*a2*a3;
        return summa;
    }

    public static void division(int a4, int a5){
        int quotient = a4/a5;
        System.out.println("chastnoe: " + quotient + " ostatok: " + a4%a5 );

    }
}

class HW81Test{
    public static void main(String[] args) {
        System.out.println("Proizvedenie: " + HW81.multiply(1.2,2.3, 5.6) +
               " Proizvedenie: " + HW81.multiply(2.2,102.3, 7.6));
        HW81.division(13,10);




    }
}

