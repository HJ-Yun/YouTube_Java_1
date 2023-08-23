package chap_01;

public class _07_typecasting {
    public static void main(String[] args) {
        //int to float or double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float) score); //93.0
        System.out.println((double) score); //93.0

        //float or double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println(score_f);
        System.out.println(score_d);

        System.out.println((int) score_f); //93
        System.out.println((int) score_d); //98

        score = 93 + (int) 93.8; //93 + 93
        System.out.println(score);

        score_d = 93 + 93.8; //93.0 + 93.8
        System.out.println(score_d);

        //int -> long -> float -> double
        double convertedScoreDouble = score;
        int convertedScoreInt = (int) score_d;

        //Number ot character
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //Character to Number
        int s3 = Integer.parseInt("93");
        System.out.println(s3);

        double s4 = Double.parseDouble("93.8");
        System.out.println(s4);
    }
}
