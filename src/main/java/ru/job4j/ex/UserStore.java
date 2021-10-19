package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Пользователь не найден.");
        }

        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("Пользователь заблокирован.");

        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Pet", true)
        };
        try {
            User user = findUser(users, "Pet");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException f) {
            f.printStackTrace();
        }
    }
}