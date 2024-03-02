package day11.task1;
//Реализуйте в классе Task1 статический метод:
//static void businessProcess(Worker worker)
//Этот метод в качестве аргумента принимает объект класса, реализующего интерфейс Worker.
// В теле этого метода на объекте worker должен 10.000 раз вызываться метод doWork(),
// и после этого должен быть один раз вызван метод bonus().
//
//Для демонстрации и тестирования работы программы, в методе main() создайте склад и по 1 рабочему.
// Свяжите этих двух рабочих со складом. После этого, вызовите метод businessProcess(Worker worker),
// передавая в качестве аргумента сотрудника.
// Вызовите метод сначала для сборщика, а потом для курьера.
// Выведите в консоль количество собранных и доставленных заказов на складе и ЗП каждого из сотрудников.
// Создайте второй склад, на который также “примите” по 1 новому сотруднику.
// Вызовите один раз метод doWork() у сотрудников второго склада.
// Проконтролируйте, что у склада 1 и его сотрудников при этом значения не меняются.

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        Worker picker1 = new Picker(warehouse1);
        Worker picker2 = new Picker(warehouse2);
        Worker courier1 = new Courier(warehouse1);
        Worker courier2 = new Courier(warehouse2);

        businessProcess(picker1);
        System.out.println("#1: "+picker1);
        businessProcess(courier1);
        System.out.println("#1: "+courier1);
        System.out.println("#1: "+warehouse1);

        System.out.println();

        businessProcess(picker2);
        System.out.println("#2: "+picker2);
        businessProcess(courier2);
        System.out.println("#2: "+courier2);
        System.out.println("#2: "+warehouse2);
    }

    static void businessProcess(Worker worker){
        for (int i=0; i<10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
