package HW11;


public class Car {
    String color;
    String engine;
    int doorCount;

    Car(String color, String engine, int doorCount)
    {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }


 /*   public static void changeDoorCount(int Dc) {
            Car Car1 = new Car(null, null, 0);
            Car1.doorCount = Dc;
        }

  */
    }


class CarTest{
/*   public static void changeDoorCount(int Dc){
            Car Car1 = new Car(null, null, 0);
            Car1.doorCount = Dc;
            }

 */

    void changeDoorCount(Car carr1, int doorCount){
        carr1.doorCount = doorCount;
    }



    public static void swapColor (Car car1, Car car2){
        /*
        Car car3 = new Car(null, null, 0);
        car3.color = car1.color;

         */
        String color3 = car1.color;
        car1.color = car2.color;
        car2.color = color3;

        /*
        System.out.println("novyj cvet 1-oj mashiny: " + car1.color);
        System.out.println("novyj cvet 2-oj mashiny: " + car2.color);

         */
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("red", "V6", 4);
        Car c2 = new Car("blue", "V8", 3);

        ct.changeDoorCount(c1, 3);
        swapColor(c1, c2);

        System.out.println("Informaciya o pervoj mashine: cvet: " + c1.color +
                " motor: " + c1.engine +
                " kolichestvo dverej: " + c1.doorCount);

        System.out.println("Informaciya o vtoroj mashine: cvet: " + c2.color +
                " motor: " + c2.engine +
                " kolichestvo dverej: " + c2.doorCount);
        /*changeDoorCount(c1, 6);
        System.out.println(c1.doorCount);

        swapColor(c1, c2);

         */

    }


}
