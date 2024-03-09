package day11.task1;
//В классах “Сборщик” и “Курьер” могут понадобиться и другие поля на ваше усмотрение (чтобы эти классы соответствовали условиям задачи).
public class Courier implements Worker {
    private int salary;
    private boolean isPayed=false;
    private Warehouse myWarehouse;

    public Courier(Warehouse myWarehouse) {
        this.myWarehouse = myWarehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        myWarehouse.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed)
            return;

        if (myWarehouse.getCountDeliveredOrders()>=10000){
            salary += 50000;
            isPayed=true;}
                else if (myWarehouse.getCountDeliveredOrders()<10000)
                    System.out.println("Бонус пока не доступен");
                        else System.out.println("Бонус уже был выплачен");
    }

    @Override
    public String toString() {
        return "Courier{salary=" + salary + "}";
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }


}
