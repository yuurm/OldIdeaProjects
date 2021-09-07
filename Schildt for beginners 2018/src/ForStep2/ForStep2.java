package ForStep2;

public class ForStep2 {
    public static void main(String[] args) {
        for(int i=1000; i>=0; i-=2){
            System.out.print("Deliteli " + i +
                    ": ");
            for(int j = 2; j < i; j++)
                if((i%j)==0)
                    System.out.print(j + " ");
            System.out.println();

        }
    }
}
