package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String a, b;
        a = "901231-1234567";
        b = "030708-4567890";

        System.out.println(a.substring(0,8));
        System.out.println(b.substring(0,b.indexOf("-") + 2));
    }
}
