package day13;

import java.util.*;

public class MessageDatabase {
//    Статическое поле “сообщения” (англ. messages), которое будет хранить список из сообщений (объектов класса Message).
//    Это поле должно инициализироваться пустым списком. Этот список и есть наша условная “база данных”,
//    которая хранит все сообщения в соц. сети.
    private static List<Message> messages = new ArrayList<>();

    //этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.
    // Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message (u1,u2,text));
    }

    //возвращает список всех сообщений в “базе данных”.
    public static List<Message> getMessages() {
        return messages;
    }

    //этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2.
    // Формат вывода должен быть таким:
    //    user1: Привет!
    //    user2: Привет, user1!
    //    user1: Как у тебя дела?
    //    user2: Все ок, спасибо :)
    //    * У вас могут быть любые другие сообщения. Где user1 и user2 - имена пользователей u1 и u2.
    public static void showDialog(User u1, User u2){
        for(Message i:getMessages()){
            if(i.getSender()==u1 && i.getReceiver()==u2 || i.getSender()==u2 && i.getReceiver()==u1)
                System.out.println(i.getSender()+": "+i.getText());
        }
    }

}
