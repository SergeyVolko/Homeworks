package pro.sky.java.course2.homework5;

public class ResultValidate {
    public static boolean isValidate(String login, String password, String confirmPassword) {
        boolean result = true;
        try {
            UserValidate.validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        isValidate("1crK__Ojji__", "rurnc", "rurnc");
    }
}
