package day11.task1;
//    c полями countPickedOrders (количество собранных заказов),
//    countDeliveredOrders (количество доставленных заказов),
//    get методами для обоих полей и методом toString() для получения информации о значениях полей склада.
public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }

    public void incrementPickedOrders(){
        countPickedOrders +=1;
    }

    public void incrementDeliveredOrders(){
        countDeliveredOrders +=1;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
}
