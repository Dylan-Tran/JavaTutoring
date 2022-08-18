package Lessons.controlFlow;

public class loop_while {
    public static void main(String[] args) {
        /*
            while loops are used to do repeated task for an unknown bound, but hopefully it ends

            while ( condition) {
                body with some sort of increment on the condition
            }

         */


        // Print all the even numbers from 0 to 20
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }
        // 2nd method without using the reminder operator

        int j = 0;
        while(j <= 20) {
            System.out.println(j);
            j = j + 2;
        }

    }
}
