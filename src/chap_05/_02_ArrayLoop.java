package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"coffee1", "coffee2", "coffee3", "coffee4"};
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " order");
        }
        System.out.println("Finished");

        System.out.println("-------------------");

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " order");
        }

        System.out.println("-----------------------");

        // Enhanced (for-each)
        for (String coffee : coffees){
            System.out.println(coffee + " order");
        }
    }
}
