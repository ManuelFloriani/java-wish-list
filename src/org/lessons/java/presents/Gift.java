package org.lessons.java.presents;

public class Gift {
    private String description;
    private String receiver;

    public Gift(String description, String receiver) {
        this.description = description;
        this.receiver = receiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString(){
        return "Gift{ Description=" + description + ", receiver= " + receiver + "}";
    }
}
