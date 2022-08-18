package Lessons.controlFlow;

public class loop {
    public static void main(String[] args) {
        /*
            Keywords for control flow within a loop
                - continue
                - break
         */

        /*
            continue - go straight to the top of the for/while loop while incrementing. Essentially, we are skipping the
            rest of the body statement
         */

        // We want to print out even numbers from 0 to 10
        for(int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }


        /*
            break - we exit out of the for loop
         */

        // We "plan" on printing out even numbers from 0 to 10
        for(int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                break;
            }
            System.out.println(i);
        }
    }
}
