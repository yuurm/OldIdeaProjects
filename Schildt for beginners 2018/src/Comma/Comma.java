package Comma;

public class Comma {
    public static void main(String[] args)
    throws java.io.IOException{


        char ch;
        int i =0;
        for (; ; ) {
            ch = (char) System.in.read();
            if (ch == '.') break;
            if (ch == ' ') System.out.println("Chislo probelov: " + i++);
        }
        System.out.println();
    }
}
