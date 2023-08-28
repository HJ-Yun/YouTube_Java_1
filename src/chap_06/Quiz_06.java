package chap_06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

public class Quiz_06 {
    public static String getHiddenData(String sort, int start) {
        String hiddenData = sort.substring(0, start);
        for (int i = 0; i < sort.length() - start; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }


        public static void main (String[]args){
            String name = "John";
            String id = "990130-1234567";
            String phone = "010-1234-5678";

            System.out.println("name : " + getHiddenData(name, 1));
            System.out.println("id : " + getHiddenData(id, 8));
            System.out.println("phone : " + getHiddenData(phone, 9));
        }
}