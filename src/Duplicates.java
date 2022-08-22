import java.util.Arrays;
import java.util.Random;

public class Duplicates {

    // Program that compares the values of array1 with the values of array2
    public static void main(String[] args) {
        // Initialise Variables
        int array1[] = new int[10];
        int array2[] = new int[10];

        Random rand = new Random();

        // This loop fills the arrays with random variables from 0 to 20
        for (int i = 0; i < array1.length || i < array2.length; i++) {
            array1[i] = rand.nextInt(0, 20);
            array2[i] = rand.nextInt(0, 20);
        }

        // Converts the arrays to a string to display their contents
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        // Nested for loop that compares the values of array1 with the values of array2
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                // Compares array1[i] (eg. where i = 1) and array2[j] (where j will equal 1 to the length of array1)
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i] + " is shared by both array1 and array2.");
                    break;
                }
            }
        }
    }
}
