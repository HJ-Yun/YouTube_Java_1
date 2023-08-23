package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //Length of character
        System.out.println(s.length()); //29

        //Change Large and Small
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //Including
        System.out.println(s.contains("Java")); //ture
        System.out.println(s.contains("C#")); //false
        //Location
        System.out.println(s.indexOf("Java")); //7 (Start from 0)
        System.out.println(s.indexOf("C#")); //Not included = -1
        System.out.println(s.indexOf("and")); //12
        System.out.println(s.lastIndexOf("and")); //23
        //Start and End
        System.out.println(s.startsWith("I like")); //ture
        System.out.println(s.endsWith(".")); //ture
    }
}
