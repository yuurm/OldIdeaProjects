package HW6;


public class Summma {

    int sum(int i1, int i2, int i3, int i4){
        return i1+i2+i3+i4;
    }

    int sum(int i1, int i2, int i3){
        return i1+i2+i3;
    }

    int sum(int i1, int i2){
        return i1+i2;
    }

    int sum(int i1){
        return i1;
    }
    int sum( ){
        return 0;
    }
}


class SummmaTest {
    public static void main(String[] args) {
        Summma sm=new Summma();

        System.out.println("Summa chisel: " + sm.sum(10,20));
        System.out.println("Summa chisel: " + sm.sum());
    }



    }

