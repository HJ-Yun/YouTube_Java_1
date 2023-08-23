package chap_02;

public class Quiz2 {
    public static void main(String[] args) {
        //115cm tall can not ride.
        //121cm tall can ride.
        int tall = 130;
        String judge = (tall >= 120) ? "can ride" : "can not ride" ;
        System.out.println("Your tall is " + tall + "cm. So you " + judge + ".");
    }
}
