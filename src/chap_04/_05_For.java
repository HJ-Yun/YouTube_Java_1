package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //Alt + Drag = Multi Select
        // For
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }

        //fori //println : Enter after print, print : Do not enter after print
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 1; i < 10 ; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.print(sum + ", ");
        }
        System.out.println();
    }
}
