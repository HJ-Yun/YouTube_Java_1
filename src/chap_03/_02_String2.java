package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // Character Change
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7)); //Start from index 7
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.lastIndexOf(".")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("and")));
        System.out.println(s.substring(s.indexOf("Java"), s.lastIndexOf("and")));

        //Delete blank
        s = "          I love Java.            ";
        System.out.println(s);
        System.out.println(s.trim());

        //Character Combine
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + ", " + s2);
        System.out.println(s1.concat(", ").concat(s2));
    }
}
