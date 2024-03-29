package pl.agh.kis.soa.guestbook.model;

public class UserData {
    private String login;
    private String password;
    private String name;
    private String surname;

    public UserData(String login, String password, String name, String surname) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
