package chap_04;

import sun.invoke.WrapperInstance;
import sun.java2d.pipe.DrawImage;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case
        //Prize for ranking
        // 1st : 100%
        // 2nd, 3rd : 50%
        // Else : No

        int ranking = 1;
        if (ranking == 1){
            System.out.println("100%");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("50%");
        } else {
            System.out.println("No");
        }
        System.out.println("Finished");

        ranking = 1;
        switch (ranking){
            case 1:
                System.out.println("100%");
                break;
            case 2:
            case 3:
                System.out.println("50%");
                break;
            default:
                System.out.println("No");
        }
        System.out.println("Finished");

        // Grade : 1st (Best), 4th (Worth)
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println(grade + " grade : " + price);

        // Range or Multiple condition = iF, else if, else
        // Exact value = switch
    }
}
