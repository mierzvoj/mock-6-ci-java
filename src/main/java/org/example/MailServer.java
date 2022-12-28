package org.example;

public class MailServer {


    Client client;
    String email;



    public boolean send(String email, String msgContent) {
        if (email.isEmpty()) {
            return false;
        }
        return true;
    }
}
