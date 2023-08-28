package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //While
        int distance =  25;
        int move = 0;
        while (move < distance) {
            System.out.println("Now moving");
            System.out.println("Distance : " + move);
            move += 3;
        }
    }
}
