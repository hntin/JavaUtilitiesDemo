package uit.se.java.utilitiesdemo;

public class JavaUtilitiesDemo {

    public static void main(String[] args) {
        System.out.println("JavaUtilitiesDemo");

        String password = "aBc123456";

        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$";

        if (password.matches(regex)) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

    }
}
