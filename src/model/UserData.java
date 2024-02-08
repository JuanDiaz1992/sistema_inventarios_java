package model;

public class UserData {
    private int id;
    private String name;
    private String username;
    private int type_user;

    public UserData() {
    }

    public UserData(int id, String name, int type_user, String username) {
        this.id = id;
        this.name = name;
        this.type_user = type_user;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType_user(int type_user) {
        this.type_user = type_user;
    }

    public int getType_user() {
        return type_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    
}
