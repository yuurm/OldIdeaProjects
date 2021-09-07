package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite chislo elementov massiva");
        int n = scanner.nextInt();

        int array [] = new int[n];

        int i = 0;

        System.out.println("Zapolnite massiv");
        while (i < array.length) {
            array[i] = scanner.nextInt();
            i++;
        }

        i = 0;


        for (i = array.length-1; i >= 0; i--) {
                  System.out.print(array[i] + " ");
            }

        System.out.println(Arrays.toString(array)); // vyvodit massiv v zerkalnom predstavlenii
        }




    }


