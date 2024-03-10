package day13;
//В методе main() этого класса необходимо создать трех пользователей.
//Затем необходимо:
//Отправить 2 сообщения от пользователя 1 пользователю 2
//Отправить 3 сообщения от пользователя 2 пользователю 1
//Отправить 3 сообщения от пользователя 3 пользователю 1
//Отправить 3 сообщения от пользователя 1 пользователю 3
//Отправить 1 сообщение от пользователя 3 пользователю 1
//
//Сообщения могут быть любыми.
//После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Korben Dallas");
        User user2 = new User("Zaratustra");
        User user3 = new User("Galina");
        user1.sendMessage(user2,"Hey, man! What's up?");
        user1.sendMessage(user2,"D'u remember me?");
        user2.sendMessage(user1,"Как ты меня нашёл?");
        user2.sendMessage(user1,"Оставь меня в покое");
        user2.sendMessage(user1,"Тчк");
        user3.sendMessage(user1,"Здравствуйте");
        user3.sendMessage(user1,"Продаю поросят не дорого");
        user3.sendMessage(user1,"Будете брать?");
        user1.sendMessage(user3,"Morning!");
        user1.sendMessage(user3,"Sure!");
        user1.sendMessage(user3,"I have 10$, is it enough?");
        user3.sendMessage(user1,"Я по-английски не понимаю");
        MessageDatabase.showDialog(user1, user2);
        //System.out.println(MessageDatabase.getMessages());
    }
}
