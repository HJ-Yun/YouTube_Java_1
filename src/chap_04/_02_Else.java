package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // If and Else
        int hour = 10;
        if (hour < 14){
            System.out.println("Coffee + 1");
        }
        else {
            System.out.println("Coffee + 0");
        }
        System.out.println("Finished");

        //If time is before 14 or already got morningCoffee
        hour = 15;
        boolean morningCoffee = true;
        if (hour >= 14 || morningCoffee == true){
            System.out.println("Coffee + 1");
        } else {
            System.out.println("Coffee + 0");
        }
        System.out.println("Finished");
    }
}
