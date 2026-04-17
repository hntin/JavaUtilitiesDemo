package uit.se.java.utilitiesdemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaUtilitiesDemo {

    public static void main(String[] args) {
        System.out.println("JavaUtilitiesDemo");
        JavaUtilitiesDemo demo = new JavaUtilitiesDemo();
        String password = "aBc123456";
        demo.isValidPass(password);
        demo.setDemo2();
    }

    public void setDemo1() {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java"); // bị loại
        System.out.println(set);
    }

    public void setDemo2() {
        String text = "java java collection set set java util";
        String[] words = text.split(" ");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);

    }

    public boolean isValidPass(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$";
        if (password.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

}
