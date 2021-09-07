package HW9;

public class HW921 {
    //int a = 1;
    static int a = 2;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        HW921 t = new HW921();
        t.abc(3);
    }

}
