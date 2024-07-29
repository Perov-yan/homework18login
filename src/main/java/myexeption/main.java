package myexeption;

public class main {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";
    private static final String ALLOWED_CHARS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

    public static void main(String[] args){
        try {
            checkCredentials("admin","123","1232");
            System.out.println("Проверка пройдена");
        }catch (WrongLoginExeptoin | WrongPasswordExeption e) {
            System.out.println("Проверка не пройдена");
            e.printStackTrace();
        }
    }

    public static void checkCredentials(String login, String password, String confirmPassword){
        if(login.length() > 20) {
            throw new WrongLoginExeptoin("Длинна логина больше 20 символов");
        }
        if (!login.matches(REGEX)){
            throw new WrongLoginExeptoin("В логине недопустимые символы");
        }
        if(password.length() > 20) {
            throw new WrongPasswordExeption("Длинна пароля больше 20 символов");
        }
        if (!password.matches(REGEX)){
            throw new WrongPasswordExeption("В пароле недопустимые символы");
        }

        if (!password.equals(confirmPassword)){
            throw new WrongPasswordExeption("Пароли не совпадают");
        }
    }
}
