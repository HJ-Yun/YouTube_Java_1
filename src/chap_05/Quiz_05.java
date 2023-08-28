package chap_05;

public class Quiz_05 {
    public static void main(String[] args) {
        // Shoes size = from 250 to 295 per size 5

        int [][]shoes = new int[(295-250) / 5 + 1][1];
        for (int i = 0; i < shoes.length ; i++) {
            for (int j = 0; j < shoes[i].length; j++) {
                shoes[i][j] = 250 + 5 * i;
            }
        }
        for (int i = 0; i < shoes.length; i++) {
            for (int j = 0; j < shoes[i].length; j++) {
                System.out.println("Shoe Size : " + shoes[i][j] + " : Stock");
            }
        }
    }
}
