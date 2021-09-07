public class Main {
    public static void main(String[] args){
        int moneyAmount = 30;

        int capuccinoPrice = 180;
        int espressoPrice = 80;
        int lattePrice = 110;
        int water = 20;

        boolean canBuyAnything = false;
        boolean isMilkEnough = false;
        boolean moneyEnoughForCapuccino = moneyAmount >= capuccinoPrice;


        if (moneyAmount >= capuccinoPrice && isMilkEnough == true) {
            System.out.println("Vy mozhete kupit capuccino");
            canBuyAnything = true;
        }

        if (moneyAmount >= espressoPrice) {
            System.out.println("Vy mozhete kupit espresso");
            canBuyAnything = true;
        }

        if (moneyAmount >= water) {
            System.out.println("Vy mozhete kupit water");
            canBuyAnything = true;
        }

        if (moneyAmount >= lattePrice  && isMilkEnough) {
            System.out.println("Vy mozhete kupit latte");
            canBuyAnything = true;
        }

        if(!canBuyAnything) {
            System.out.println("Nedostatochno sredstv");


        }
        System.out.println(canBuyAnything ? "Vyberite napitok" :
                "Nedostatochno sredstv");


    }
}
