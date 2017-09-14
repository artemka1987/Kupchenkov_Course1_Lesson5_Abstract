import java.util.Calendar;

public class UserStorage {

    public static User[] users = new User[]{new User(1, "Ivan", "Ivanov", "ivanov@gmail.com", Calendar.getInstance().getTime(), "Ivanov", "123"),
                                            new User(2, "Petr", "Petrov", "petrov@gmail.com", Calendar.getInstance().getTime(), "Petrov", "456"),
                                            new User(3, "Oleg", "Sidiriv", "sidiriv@gmail.com", Calendar.getInstance().getTime(), "Sidorov", "789")};


    // Метод аутентификации пользователя
    public static User authentification(User user){
        for (User otherUser : users){
            if (otherUser.equals(user)) return otherUser;
        }
        return null;
    }

}
