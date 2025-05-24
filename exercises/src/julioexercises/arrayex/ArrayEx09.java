package julioexercises.arrayex;

import java.util.Scanner;

public class ArrayEx09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 11, 5};

        int element = scanner.nextInt();

        scanner.close();

        int repeated = 0;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                repeated++;
            }
        }

        if (repeated == 0) {
            System.out.println("The number " + element + " does not appear in the array");
        } else {
            System.out.println("The number " + element + " repeats itself " + repeated + " times inside the array");
        }
    }
}
