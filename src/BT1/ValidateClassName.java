package BT1;


import java.util.regex.Pattern;

public class ValidateClassName {
        public static boolean validate(String input) {
            String pattern = "^[CAP][0-9]{4}[GHIKLM]$";

            // Kiểm tra chuỗi đầu vào có phù hợp với regex pattern hay không
            if (!Pattern.matches(pattern, input)) {
                return false;
            }

            return true;
        }

        public static void main(String[] args) {
            String input = "C0318G"; // Tên lớp học cần kiểm tra

            if (validate(input)) {
                System.out.println("Tên lớp học hợp lệ.");
            } else {
                System.out.println("Tên lớp học không hợp lệ.");
            }
        }
    }

