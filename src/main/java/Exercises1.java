public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        long x = 1;
        for (int i = 2; i <= n; i++) {
            x *= i;
        }
        return x;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        long a = 1;
        long b = 1;
        long c = 0;
        if ( n == 1 || n == 2)
            return 1;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][];

        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = '*';
            }
        }
        return triangle;

    }

    public static void main(String[] args) {
        // test your code here!
    }

}