package julioexercises.arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int findElement = scan.nextInt();
        boolean test = false;
        for (int i = 0; i < array.length; i++) {
            if (findElement == array[i]) {
                test = true;
                break;
            }
        }

        if (test) {
            System.out.println("O elemento " + findElement + " está presente no seguinte array: " + Arrays.toString(array));
        } else {
            System.out.println("O elemento " + findElement + " não está no array.");
        }
        scan.close();
    }
}
