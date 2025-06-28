package com.mycompany.multicastchat;

//Classe utilizada para modelar o objeto mensagem, que será enviada pelo cliente para o servidor.
public class ChatMessage {
    private String date;
    private String time;
    private String username;
    private String message;

    public ChatMessage(String date, String time, String username, String message) {
        this.date = date;
        this.time = time;
        this.username = username;
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }
}
