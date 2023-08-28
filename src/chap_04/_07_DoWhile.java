package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance) {
            System.out.println("Now moving");
            System.out.println("Distance : " + move);
            move += 3;
        }
        System.out.println("Finished");

        System.out.println("------------");

        height = 25; //if height is 25m
        while (move + height < distance) {
            System.out.println("Now moving");
            System.out.println("Distance : " + move);
            move += 3;
        }
        System.out.println("Finished");

        System.out.println("-----------");

        //Do while
        do {
            System.out.println("Now moving");
            System.out.println("Distance : " + move);
            move += 3;
        } while (move + height < distance);
            System.out.println("Finished");
    }
}
