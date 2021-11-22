package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.createUsersTable();
        userServiceImpl.saveUser("Alex", "Lyakun", (byte) 12);
        userServiceImpl.saveUser("Matvei", "Krasnikov", (byte) 10);
        userServiceImpl.saveUser("Dmitriy", "Gaifulin", (byte) 9);
        userServiceImpl.saveUser("Varvara", "Videnko", (byte) 8);
        userServiceImpl.getAllUsers().forEach(System.out::println);
        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();
    }
}
