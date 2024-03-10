package day13;

import java.util.*;

public class User {
    private String username;
    private List<User> subscriptions;
    private User user;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    //подписывает пользователя на пользователя user
    public void subscribe(User user){
        this.subscriptions.add(user);
    }

    //возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
    public boolean isSubscribed(User user){
        for(User i:this.subscriptions){
            if(i==user)
                return true;
        }
        return false;
    }

    //возвращает True, если пользователь user является другом и False, если пользователь user не является другом.
    //Подумайте, что такое дружба в контексте соц. сетей.
    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    //отправляет сообщение с текстом text пользователю user. Здесь должен использоваться статический метод из MessageDatabase.
    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user,text);
    }

    //возвращает строковое представление пользователя (имя пользователя).
    public String toString() {
        return username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}

