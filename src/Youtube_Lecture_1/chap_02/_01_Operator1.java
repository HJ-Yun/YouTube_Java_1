package Youtube_Lecture_1.chap_1.chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {


        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(5 % 2);

        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);

        int a = 10;
        int b = 20;
        int c;

        c = a + b;
        System.out.println(c);

        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); //11

        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10
        System.out.println(val); //11

        int waiting;
        waiting = 0;

        System.out.println("waiting person : " + waiting++); //0
        System.out.println("waiting person : " + waiting++); //1
        System.out.println("waiting person : " + waiting++); //2
        System.out.println("total person : " + waiting); //3





    }
}
