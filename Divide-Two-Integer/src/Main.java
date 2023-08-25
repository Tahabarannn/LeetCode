public class Main {
    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(Integer.MIN_VALUE, -1));
    }


    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        if (dividend == divisor) return 1;
        if (divisor == 1) return dividend;
        if (divisor == -1) return -dividend;

        int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        while ((dividend - divisor) >= 0) {
            dividend -= divisor;
            quotient++;
        }

        return sign < 0 ? -quotient : quotient;
    }
}