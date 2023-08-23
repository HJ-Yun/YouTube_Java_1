package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean food1 = false;
        boolean food2 = false;
        boolean food3 = true;

        System.out.println(food1 || food2 || food3); //false or false or ture = ture
        System.out.println(food1 && food2 && food3); //false and false and ture = false
        System.out.println((5 > 3) && (3 > 1)); //ture and ture = ture
        System.out.println((5 > 3) && (3 < 1)); //ture and false = false
        System.out.println((5 > 3) || (3 < 1)); //ture or false = ture
        System.out.println(!true); //false (opposite result)
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //ture
    }
}
