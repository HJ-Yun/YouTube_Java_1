package chap_06;

public class _01_Method {

    //Define Method
    public static void sayHello() {
        System.out.println("Hello, There.");
    }
    public static void main(String[] args) {
        //Call Method
        System.out.println("Before call");
        sayHello();
        System.out.println("After call");
    }
}
