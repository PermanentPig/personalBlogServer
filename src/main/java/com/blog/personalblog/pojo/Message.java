package com.blog.personalblog.pojo;

import java.util.Date;

public class Message {
    private int id;
    private String messagePerson;
    private Date messageTime;
    private String messageContent;
    private String messageReplyContent;
    private Date messageReplyTime;
    private String messageReplyMessage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessagePerson() {
        return messagePerson;
    }

    public void setMessagePerson(String messagePerson) {
        this.messagePerson = messagePerson;
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageReplyContent() {
        return messageReplyContent;
    }

    public void setMessageReplyContent(String messageReplyContent) {
        this.messageReplyContent = messageReplyContent;
    }

    public Date getMessageReplyTime() {
        return messageReplyTime;
    }

    public void setMessageReplyTime(Date messageReplyTime) {
        this.messageReplyTime = messageReplyTime;
    }

    public String getMessageReplyMessage() {
        return messageReplyMessage;
    }

    public void setMessageReplyMessage(String messageReplyMessage) {
        this.messageReplyMessage = messageReplyMessage;
    }
}
