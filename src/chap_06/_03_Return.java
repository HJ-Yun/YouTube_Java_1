package chap_06;

public class _03_Return {

    public static String getPhoneNumber(){
        String getPhoneNumber = "1234-5678";
        return getPhoneNumber;
    }

    public static String getAddress(){
        return "Seoul";
    }

    public static String getActivity(){
        return "Running, Shooting, Golf";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println(contactNumber);

        String hotelAddress = getAddress();
        System.out.println(hotelAddress);

        System.out.println(getActivity());
    }
}