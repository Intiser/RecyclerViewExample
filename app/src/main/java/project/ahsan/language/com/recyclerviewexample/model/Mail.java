package project.ahsan.language.com.recyclerviewexample.model;


import java.util.Date;

/*
    This is Data Model is not Proper
    Just took the necessary fields for RecyclerView
 */
public class Mail {
    String sender;
    String subject;
    Date date;
    String messageBody;

    public Mail(String sender, String subject, Date date, String messageBody) {
        this.sender = sender;
        this.subject = subject;
        this.date = date;
        this.messageBody = messageBody;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
