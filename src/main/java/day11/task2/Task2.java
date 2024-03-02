package day11.task2;

//После того, как все классы будут реализованы, в методе main() класса Task2 последовательно выполните следующие действия,
// проверяя показатель здоровья у персонажа, на которого направлено действие:
//Воин атакует Паладина
//Паладин атакует Мага
//Шаман лечит Мага
//Маг атакует Паладина, тип атаки М
//Шаман атакует Воина, тип атаки Ф
//Паладин лечит себя
//Воин атакует Мага 5 раз
//
//Результат в консоли:
//Paladin{health=85}
//Magician{health=85}
//Magician{health=100}
//Paladin{health=69}
//Warrior{health=98}
//Paladin{health=94}
//
//Magician{health=70}
//Magician{health=40}
//Magician{health=10}
//Magician{health=0}
//Magician{health=0}


public class Task2 {
    public static void main(String[] args) {
    Paladin paladin = new Paladin();
    Magician magician = new Magician();
    Shaman shaman = new Shaman();
    Warrior warrior = new Warrior();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);

        System.out.println();

        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);

    }
}
