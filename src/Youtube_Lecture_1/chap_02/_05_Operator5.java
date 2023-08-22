package Youtube_Lecture_1.chap_1.chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int max =  (x > y) ? x : y; // (if) ? ture value : false value;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x == y) ? "same" : "diff";
        System.out.println(s);
    }
}
