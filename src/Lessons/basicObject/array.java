package Lessons.basicObject;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        /*
        Initializing array we use the following notation

        type[] variable_name = new type[length];
         */

        int[] arr = new int[5];

        /*
        Helper functions: Arrays.toString(arr);
         */
        System.out.println(Arrays.toString(arr));

        /*
        Arrays are 0-index meaning the first element is in the 0-th index.

        We can get the element using arr[index] notation.
        Updating array element values, we use the following notation: arr[index] = value.
         */

        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = -4;
        arr[4] = 10;
        System.out.println(Arrays.toString(arr));

        /*
        The second way to initialize an array is to use {} notation
         */
        int[] arr2 = new int[]{ 5, 3, 2, -4, 10};
        System.out.println(Arrays.toString(arr2));

        // Print the sum of all the element
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        // Save the max value of the array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        // We add up the numbers of even index!
        int evenSum = 0;
        for(int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            }
        }
        System.out.println(evenSum);

        // Take the sum of all the odd numbers in the array
        int oddSum = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                oddSum += arr[i];
            }
        }
        System.out.println(oddSum);

    }
}
