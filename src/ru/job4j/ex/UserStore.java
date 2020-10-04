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
            throw new UserNotFoundException("User with that login not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = user.isValid();
        if (!rsl || user.getUsername().length() < 3) {
            throw new UserInvalidException("The User is not valid");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}