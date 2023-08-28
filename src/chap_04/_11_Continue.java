package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i < 50; i++) {
            if (i == noShow){
                System.out.println("Pass");
                continue;
            }

            System.out.println(i);
            sold++;

            if (sold == max){
                System.out.println("Sold out");
                break;
            }
        }
        System.out.println("Closed");
    }
}