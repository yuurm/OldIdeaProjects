package HW8;

public class HW82 {
    static final double pi = 3.14;
    static double radius;

    public HW82 (double radius2){
        radius = radius2;
        System.out.println("Krug sozdan! ");
    }




    double ploschadKruga(double radius3) {
        double areaOfCircle = pi * radius3 * radius3;
        return areaOfCircle;
        }

    static double dlinaOkruzhnosti(double radius4) {
        double cicumference = 2 * pi * radius4;
        return cicumference;
    }

    public void showInfoHW82(double radius5){
        System.out.println("Radius raven: " + radius5 +
                " Ploschad kruga ravna: " + ploschadKruga(radius5) +
                " Dlina okruzhnosti: " + dlinaOkruzhnosti(radius5));
     }

}

class HW82Test {
    public static void main(String[] args) {
        HW82 circle = new HW82(10.1);
        circle.ploschadKruga(10.1);
        HW82.dlinaOkruzhnosti(11.1);
        circle.showInfoHW82(13.1);
    }

 }



