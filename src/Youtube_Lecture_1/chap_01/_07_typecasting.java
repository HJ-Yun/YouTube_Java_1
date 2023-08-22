package Youtube_Lecture_1.chap_1;

public class _07_typecasting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println(score_f);
        System.out.println(score_d);

        System.out.println((int) score_f);
        System.out.println((int) score_d);

        score = 93 + (int) 93.8;
        System.out.println(score);

        score_d = 93 + 93.8;
        System.out.println(score_d);

        double convertedScoreDouble = score;
        int convertedScoreInt = (int) score_d;

        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        int s3 = Integer.parseInt("93");
        System.out.println(s3);

        double s4 = Double.parseDouble("93.8");
        System.out.println(s4);
    }
}
