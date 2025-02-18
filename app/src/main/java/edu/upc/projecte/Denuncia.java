package edu.upc.projecte;

public class Denuncia {
    public String date;
    public String title;
    public String message;
    public String sender;

    public Denuncia(String title, String message, String sender) {
        this.date = "date";
        this.title = title;
        this.message = message;
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
