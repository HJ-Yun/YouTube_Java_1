package Youtube_Lecture_1.chap_1.chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean food1 = false;
        boolean food2 = false;
        boolean food3 = true;

        System.out.println(food1 || food2 || food3); //or
        System.out.println(food1 && food2 && food3); //and

        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 < 1));
        System.out.println((5 > 3) || (3 < 1));

        System.out.println(!true); //opposite
        System.out.println(!(5 == 5));
        System.out.println(!(5 == 3));
    }
}
