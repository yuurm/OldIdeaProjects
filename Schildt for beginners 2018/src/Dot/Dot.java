package Dot;

public class Dot {


        public static void main(String[] args)
                throws java.io.IOException{
            char ch;
            int i=0;
            System.out.println("Vvedite znak i nazhmite ENTER: ");

            do{
                ch = (char) System.in.read();
                if(ch==' ') i++;
            } while(ch != '.');
            System.out.println("Vy nazhali Dott");
            System.out.println("Vsego probelov: " + i);
            }
    }

