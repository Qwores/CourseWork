import java.util.Date;

public class Order {

    int dishesQuantity;
    int guestsQuantity;
    String orderID; //был int
    Double cost;
    String date;
    String orderAddress;
    String orderType;
    String startTime;

    //constructor
    Order(int dishesQuantity, int guestsQuantity, String orderID, Double cost, String date,
          String orderAddress, String orderType, String startTime) {
        this.dishesQuantity = dishesQuantity;
        this.guestsQuantity = guestsQuantity;
        this.orderID = orderID;
        this.cost = cost;
        this.date = date;
        this.orderAddress = orderAddress;
        this.orderType = orderType;
        this.startTime = startTime;
    }

    public String getOrderID(){
        return orderID;
    }

    @Override
    public String toString() {
        return orderID;
    }
}