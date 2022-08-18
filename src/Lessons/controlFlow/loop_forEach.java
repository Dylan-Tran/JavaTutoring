package Lessons.controlFlow;

public class loop_forEach {
    public static void main(String[] args) {
        /*
            We can iterate through an iterable object using a for-each loop.

            for ( iterable_type variable_name : iterable_object) {
                // logic
            }
         */

        int[] arr = new int[]{5, 10, 7, -8, -2, -1};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // This code can be rewritten using a for-each loop
        for(int e: arr) {
            System.out.println(e);
        }

    }
}
