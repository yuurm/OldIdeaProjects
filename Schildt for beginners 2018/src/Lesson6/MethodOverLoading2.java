package Lesson6;

public class MethodOverLoading2 {
    int sum(int i1, int i2){
        return i1+i2;
    }

    String sum(String s1, String s2){
        return s1+s2;
    }

}


class MethodOverLoading2Test {
    public static void main(String[] args) {
        MethodOverLoading2 mO2=new MethodOverLoading2();

        mO2.sum(10,20);


        System.out.println(mO2.sum("privet ","medved!"));
    }



}