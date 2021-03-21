package prep;

public class Arithmetic {

    protected static int square(int int1) {
        return int1 * int1;
    }

    protected static int sum(int int1, int int2) {
        return int1 + int2;
    }

    protected static int difference(int int1, int int2) {
        return int1 - int2;
    }

    protected static int product(int int1, int int2) {
        return int1 * int2;
    }

    protected static double getAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

}
