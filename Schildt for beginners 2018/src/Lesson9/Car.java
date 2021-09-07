package Lesson9;

public class Car {
    String color;
    public static int a = 10;
    String engine;
    static int count;
    //static int count = this.a; - nevozmozhno napisat


    public static void changeA (int b) {
        Car c = new Car("red", "V8");
        c.a = b;
    }


    public Car(String color2, String engine){
        count++;
        this.color = color2;
        this.engine = engine;
    }
    public void showColor (){
        System.out.println("Cvet mashiny: " + color);
        changeColor("red");
    }

    public void changeColor(String color3) {
        System.out.println("Cvet mashiny izmenitsya");
        int cena = 5000;
        color = color3;
        cena += 1000;

    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        System.out.println(c.color);
        c.changeColor("black");
        System.out.println(c.color);

    }
}
