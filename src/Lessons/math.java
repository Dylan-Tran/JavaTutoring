package Lessons;

public class math {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        /*
            a % b - modulo operator

            This takes the reminder of a divided by b.

         */

        // We can check if an integer is even by using the following expression
        boolean holder = a % 2 == 0;

        // Shortcuts for math operators

        // Increment by 1
        a++; // equivalent to a = a + 1

        // Decrement by 1
        a--; // equivalent to a = a - 1

        // Add by b
        a += b; // equivalent to a = a + b

        // Multiply by b
        a *= b; // equivalent to a = a * b

        // subtract, divided, mod, and power by b
        a -= b;
        a /= b;
        a %= b;
        a ^= b;
    }
}
