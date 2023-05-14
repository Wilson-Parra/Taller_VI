package model.repository;

import model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========== saveObj Insert ==========");
        User userInsert = new User();
        userInsert.setUser_firstname("wilson");
        userInsert.setUser_lastname("parra");
        userInsert.setUser_email("wilson@gmail.com");
        userInsert.setUser_password("Wilson1025527142");
        repository.saveObj(userInsert);
        User userInsert2 = new User();
        userInsert2.setUser_firstname("pepe");
        userInsert2.setUser_lastname("trujillo");
        userInsert2.setUser_email("pepegrillo@gmail.com");
        userInsert2.setUser_password("grillo2010");
        repository.saveObj(userInsert2);
        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
            System.out.println(repository.byIdObj(1));
            System.out.println();

            System.out.println("========== saveObj ==========");
            User userUpdate = new User();
            userUpdate.setUser_id(2);
            userUpdate.setUser_firstname("stick");
            userUpdate.setUser_lastname("lolito");
            userUpdate.setUser_email("lolito@gmail.com");
            userUpdate.setUser_password("lolitostick1013");
            repository.listAllObj().forEach(System.out::println);
            System.out.println();

            System.out.println("========== deleteObj =========");
            repository.deleteObj(2);
            repository.listAllObj().forEach(System.out::println);
    }
}
