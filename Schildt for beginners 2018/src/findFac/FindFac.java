package findFac;

/*Ispolzovanie vlozhennyh ciklov
dlya nahozhdeniyz deliteley chisel
ot 2 do 100
*/

public class FindFac {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++){
            System.out.print("Deliteli " + i +
                    ": ");
            for(int j = 2; j < i; j++)
                if((i%j)==0)
                    System.out.print(j + " ");
            System.out.println();

        }
    }
}

