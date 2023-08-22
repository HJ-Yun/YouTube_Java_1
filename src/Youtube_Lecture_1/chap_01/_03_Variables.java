package Youtube_Lecture_1.chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "Jin";
        int hour = 15;

        System.out.println(name + " , your baggage will be shipped.");
        System.out.println(name + ", " + hour + "hours will be taken.");

        double score = 90.5;
        char grade = 'A';
        name = "Yun";
        System.out.println(name + ", Your average is " + score + ".");
        System.out.println("and your grade is " + grade + ".");
        boolean pass = true;
        System.out.println("Did you pass this test?" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 10000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
    }
