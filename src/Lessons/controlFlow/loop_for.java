package Lessons.controlFlow;

public class loop_for {
    public static void main(String[] args) {
        /*
         for loops are used to do repeated tasks for a KNOWN bound

         for ( initialize variable ; condition ; increment ) {
                body
         }


         By convention, we use i, j, k because i means index
         */

        // Print the numbers from 0 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Print all the even numbers from 0 to 20

        // We do the bounds
        for (int i = 0; i <= 20; i++) {
            // We do the logic
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 2nd way to do it
        for(int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }
}
