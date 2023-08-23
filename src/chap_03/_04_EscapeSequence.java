package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //Escape Character, Special Character
        System.out.println("Java");
        System.out.println("is");
        System.out.println("fun.");

        // \n
        System.out.println("Java\nis\nfun."); //Change line

        // \t
        System.out.println("candy\t$2"); //tap
        System.out.println("meat\t$100");
        System.out.println("snack\t$12");

        // \\
        System.out.println("C:\\Program Files\\Java"); // "/"

        // \" or \'
        System.out.println("He said \"Go home!\"");

        char c = 'A';
        System.out.println(c);
        c = '\'';
        System.out.println(c);
    }
}
