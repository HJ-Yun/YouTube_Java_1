package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int max =  (x > y) ? x : y; // (if) ? (ture value) : (false value);
        System.out.println(max);

        int min = (x < y) ? x : y; // (5 < 3) ? 5 : 3;
        System.out.println(min); //3

        boolean b = (x == y) ? true : false; // (5 == 3) ? ture : false;
        System.out.println(b); //false

        String s = (x == y) ? "same" : "diff"; // (5 == 3) ? "same" : "diff";
        System.out.println(s); //diff
    }
}
