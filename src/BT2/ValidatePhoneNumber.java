package BT2;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static boolean validate(String input) {
        String pattern = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

        // Kiểm tra chuỗi đầu vào có phù hợp với regex pattern hay không
        if (!Pattern.matches(pattern, input)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "(84)-(0978489648)"; // Số điện thoại cần kiểm tra

        if (validate(input)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
}
