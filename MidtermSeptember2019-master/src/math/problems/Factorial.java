package math.problems;

public class Factorial {
    //using Recursion
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }
    //using Iteration
    static int factorial(int n){
        int rec=1,i;
        for(i=2;i<=n;i++)
            rec *=i;
            return rec;
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println("********Using Recursion*******");
        int num=5;
        System.out.println("The factorial of "+num+" is "+fact(5));
        System.out.println("********Using Iteration*******");
        System.out.println("The factorial of "+num+" is "+fact(5));


    }
}
