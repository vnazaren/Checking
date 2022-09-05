public class TestStringBuilder {
    public static void main(String[] args) {
        String phoneCode = "38";
        StringBuilder phoneNumber = new StringBuilder("501234567");
        while (phoneNumber.length() < 10) {
            phoneNumber.insert(0, "0");
        }

        phoneNumber.insert(0, "(");
        phoneNumber.insert(4, ")");
        phoneNumber.insert(8, "-");
        phoneNumber.insert(11, "-");

        System.out.println("+" + phoneCode + phoneNumber);
    }
}



//    int getCountryPhoneCode();      //For example: 38
//    int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
//
//    String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
