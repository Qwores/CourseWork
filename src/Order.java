public class Order {

    int dishesQuantity;
    int guestsQuantity;
    String orderID;
    int cost;
    String date;
    String orderAddress;
    String orderType;
    String startTime;

    Order(int dishesQuantity, int guestsQuantity, String orderID, int cost, String date,
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
        return this.dishesQuantity + this.guestsQuantity + this.orderID + this.cost +
                this.date + this.orderAddress + this.orderType + this.startTime;
    }
}