package pro.sky.java.course2.homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate {
    public static void validate(String login, String password, String confirmPassword) {
        Pattern pattern = Pattern.compile("\\w{1,20}");
        Matcher matcherLogin = pattern.matcher(login);
        Matcher matcherPassword = pattern.matcher(password);
        if (!matcherLogin.matches()) {
            throw new WrongLoginException("Wrong login.");
        }
        if (!matcherPassword.matches()) {
            throw new WrongPasswordException("Wrong password");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password not equal with confirmPassword");
        }
    }
}
