package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // If
        int hour = 10; // 10 a.m.
        if (hour < 14) {
            System.out.println("Coffee +1");
            System.out.println("More");
        }
        System.out.println("Finished");

        hour = 11;
        boolean morningCoffee = false;
        if (hour < 14 && morningCoffee == false) {
            System.out.println("Coffee +1");
        }
        System.out.println("Finished");

        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee) {
            System.out.println("Coffee +1");
        }
        System.out.println("Finished");
    }
}
