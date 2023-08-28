package chap_06;

public class _05_overLoading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3, 3));
    }
}