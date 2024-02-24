package day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA=100;
    private final static int MIN_STAMINA=0;
    //изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал
    private static int countPlayers=0;

   public Player (int stamina){
        this.stamina=stamina;

        if (getCountPlayers()<6)
            countPlayers++;
        }

    //run() - игрок бежит при вызове этого метода.
    // Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
    // Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
    public void run(){
        if (this.stamina==0)
            return;

        this.stamina--;

        if (this.stamina==0)
            countPlayers--;
    }

    //info() -  выводит сообщение в зависимости от количества игроков на поле.
    // Если игроков меньше 6, то выводит сообщение: “Команды неполные.
    // На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”.
    // Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
    public static void info() {
        if (countPlayers<6){
            System.out.println("На поле еще есть "+(6-countPlayers)+" свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
