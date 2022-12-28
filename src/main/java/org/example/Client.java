package org.example;

public class Client {
    String name;
    String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return "test@test";
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

}
