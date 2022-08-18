package Lessons.controlFlow;

public class if_statement {
    public static void main(String[] args) {
        /*
        if statement control the flow of the program

        if ( conditions ) {
            true body
        } else {
            false body
        }
        */

        boolean isRaining = true;
        if (isRaining == true) {
            System.out.println("It is raining");
        } else {
            System.out.println("It is not raining");
        }

        // Remarks: else statement is not needed.

        // else-if statement is used to extend our if statement

        int x = 0;
        if (x == -1) {
            System.out.println("x is negative");
        } else if (x == 0) {
            System.out.println("x is zero");
        } else {
            System.out.println("x is positive");
        }

        /*
        You are giving a players rating which can be in the range from 0 to 3000. A player is considered a beginner if
        there rating is less than 1500. An intermediate player if 1500 <= rating and rating < 2000. An advance player
        if 2000 <= rating and rating < 2500. A pro player if  rating >= 2500

        Given a person rating print out their player status.
        */
        int rating = 1;
        if (rating >= 2500) {
            System.out.println("Pro Status");
        } else if (rating >= 2000) {
            System.out.println("Advance Player");
        } else if (rating >= 1500 && rating < 2000) {
            System.out.println("Intermediate player");
        } else if (rating > 1500) {
            System.out.println("Beginner Player");
        }

        // if block will run until it has its first condition. And we can use this to simplify the code above.
        if (rating >= 2500) {
            System.out.println("Pro Status");
        } else if (rating >= 2000) {
            System.out.println("Advance Player");
        } else if (rating >= 1500) {
            System.out.println("Intermediate player");
        } else {
            System.out.println("Beginner Player");
        }

    }
}
