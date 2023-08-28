package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.println(s);
        }

        if (args.length == 1){
            switch (args[0]){
                case "1" :
                    System.out.println("First Menu");
                    break;
                case "2" :
                    System.out.println("Second Menu");
                    break;
                case "3" :
                    System.out.println("Third Menu");
                default:
                    System.out.println("Type from 1 to 3");
            }
        }
        else {
            System.out.println("Type only 1 dijit from 1 to 3");
        }
    }
}