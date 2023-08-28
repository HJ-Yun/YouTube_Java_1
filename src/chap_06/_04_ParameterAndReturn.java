package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        //return number * number;
    }

    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        int retVal = getPower(2);;
        System.out.println(retVal);

        int retVal2 = getPowerByExp(2,3);
        System.out.println(retVal2);
    }
}