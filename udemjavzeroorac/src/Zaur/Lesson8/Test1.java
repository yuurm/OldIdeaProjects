package Zaur.Lesson8;

public class Test1 {
    public final int a;

    Test1(){
        a=10;
    }

    Test1(boolean b){
        a=15;
    }

    public void abc(final short s){
        byte b = 10;
        System.out.println(s+b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.a);
    }
}
