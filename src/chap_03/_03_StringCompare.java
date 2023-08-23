package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //Character compare
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals("Java")); //true
        System.out.println(s2.equals("python")); //false
        System.out.println(s2.equalsIgnoreCase("python")); //true

        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); //ture (Contents)
        System.out.println(s1 == s2); //true (Reference)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //ture (Contents)
        System.out.println(s1 == s2); //false (Reference)
    }
}
