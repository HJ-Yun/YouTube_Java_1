package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Product = 20
        // Customer = 50

        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
            if (i == 20) {
                System.out.println("Sold out");
                break;
            }
        }
        System.out.println("Closed");
    }
}
