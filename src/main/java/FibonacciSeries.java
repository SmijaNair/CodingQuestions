public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibonacciSeries(2));
        System.out.println(fibonacciSeries(5));
    }

    public static int fibonacciSeries(int n) {
        if (n == 1) {
                return n;}else{
            return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);}
        }
    }
}

