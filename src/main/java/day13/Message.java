package day13;

import java.text.SimpleDateFormat;
import java.util.*;

public class Message {
    private User sender; //отправитель сообщения
    private User receiver; //получатель сообщения
    private String text; //текст сообщения
    private Date date; //дата отправки сообщения

    //Конструктор должен принимать 3 аргумента - отправителя, получателя и текст сообщения.
    //Также, конструктор должен назначать полю date текущее время (то есть время создания объекта Message).
    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        //System.out.println(formatter.format(date));
        this.date=new Date();
    }


//    FROM: 'Имя отправителя'
//    TO: 'Имя получателя'
//    ON: Sun Aug 30 19:07:34 MSK 2020
//    'Текст сообщения'
    @Override
    public String toString() {
        return "\nFROM: " + sender +
                "\nTO: " + receiver +
                "\nON: " + date +
                "\n'" + text +"'\n";
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
