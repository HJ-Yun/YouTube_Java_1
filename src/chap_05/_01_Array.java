package chap_05;

public class _01_Array {
    public static void main(String[] args) {
//        String coffeeRoss = "coffee1";
//        String coffeeRachel = "coffee2";
//        String coffeeChandler = "coffee3";
//        String coffeeMonica = "coffee4";
//
//        System.out.println(coffeeRoss + "order");
//        System.out.println(coffeeRachel + "order");
//        System.out.println(coffeeChandler + "order");
//        System.out.println(coffeeMonica + "order");

        // Making array 1st method
        //String[] coffees = new String[4];
        //coffees[0] = "coffee1"; // Start from 0
        //coffees[1] = "coffee2";
        //coffees[2] = "coffee3";
        //coffees[3] = "coffee4";

        //Making array 2nd method
        //String coffees[] = new  String[4];

        //Making array 3rd method
        //String[] coffees = new String[] {"coffee1", "coffee2", "coffee3", "coffee4"};

        //Making array 4th method
        String[] coffees = {"coffee1", "coffee2", "coffee3", "coffee4"};

        System.out.println(coffees[0] + " order");
        System.out.println(coffees[1] + " order");
        coffees[2] = "juice";
        System.out.println(coffees[2] + " order");
        System.out.println(coffees[3] + " order");
    }
}
