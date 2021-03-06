package com.company;

public class Computer {

    public static int id = 23;
    public static String name = "My computer";
    public static String operatingSystem = "Microsoft Windows";
    public static Computer computer = new Computer();

    private Computer() {
    }

    public static Computer getInstance() {
        return computer;
    }
}
////////////////
public class User {
    private String userName;
    private String login;
    private String password;

    public User(String userName, String login, String password) {
        this.userName = userName;
        this.login = login;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
//////////////////

public class Main {
    public static void main(String[] args) {
        User user = new User("Kate", "kate", "qwerty");
        user.setUserName("Anna");

        System.out.println(user.getUserName() + " " + user.getLogin() + " " + user.getPassword());
        Computer user1 = Computer.getInstance();
        Computer user2 = Computer.getInstance();
        Computer user3 = Computer.getInstance();
        Computer user4 = Computer.getInstance();

        user1.id = 000;
        user3.name = "Not My Computer";

        System.out.println(user1.id);
        System.out.println(user2.id);
        System.out.println(user3.id);
        System.out.println(user4.id);

        System.out.println(user1.name);
        System.out.println(user2.name);
        System.out.println(user3.name);
        System.out.println(user4.name);

        System.out.println(user1.operatingSystem);
        System.out.println(user2.operatingSystem);
        System.out.println(user3.operatingSystem);
        System.out.println(user4.operatingSystem);
    }
}

