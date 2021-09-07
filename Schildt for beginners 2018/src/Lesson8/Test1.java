package Lesson8;

public class Test1
{

    public static final int a = 10;

    /*
    Test1 (){
        a=10;
    }
    */


    /*

    Test1 (boolean b){
        a=15;
    }
    */


    public void abc(final short s){
        final byte b = 10;
        //s++;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Test1 t = new Test1();

        //System.out.println(t.a);
        System.out.println(a);
    }
}