package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //ElseIF
        //Orange juice -> mango juice -> Coffee
        boolean orangeJuice = false;
        boolean mangoJuice = false;
        if (orangeJuice == true){
            System.out.println("Order Orange juice");
        } else if (mangoJuice == true) {
            System.out.println("Order Mango juice");
        } else {
            System.out.println("Order Coffee");
        }

        //Multiple ElseIf
        orangeJuice = false;
        mangoJuice = false;
        boolean peachJuice = true;
        if (orangeJuice == true){
            System.out.println("Order Orange juice");
        } else if (mangoJuice == true) {
            System.out.println("Order Mango juice");
        } else if (peachJuice) {
            System.out.println("Oreder Peach juice");
        } else {
            System.out.println("Order Coffee");
        }
    }
}
