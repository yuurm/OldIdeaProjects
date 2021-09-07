package Lesson12;

public class Car {
    int engine;
    int doorCount;

    Car (int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount){
                System.out.println("Moschnost motora i kolichestvo dverej  u pervoj mashiny bolshe");
            } else
                System.out.println("Moschnost motora bolshe a kolichestvo dverej menshe u pervoj mashiny");
        } else
            System.out.println("Moschnost motora  u pervoj mashiny menshe");
    }
}
