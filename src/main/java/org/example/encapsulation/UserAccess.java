package org.example.encapsulation;

public class UserAccess {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Mutia");
        System.out.println(user.getUserName());

        user.setPassword("Haha");
        user.setPassword("Antarrrr");
        System.out.println(user.getPassword());
    }
}
