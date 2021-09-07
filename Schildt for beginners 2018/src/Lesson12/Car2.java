package Lesson12;

public class Car2 {
    void maximum (int i1, int i2, int i3){
        if(i1>i2 && i1>i3){
            System.out.println("Maxinmum - i1");
        } else if (i2>i1 && i2 > i3){
            System.out.println("Maximum - i2");
        } else System.out.println("MAximum - i3");
    }


    void abc () {
        String str;
        int a = 10;
        if (a>=10) {
            str = "Privet";
            } if (a< 10) {
            str = "Poka";}
        else {
            str = null;
        }
        System.out.println(str);
        }


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Car2 t = new Car2();
        t.maximum(4, 7, 3);

        int maximum2 = (a>b) ? a: b;
        System.out.println(maximum2);

    }
}
