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


    @Override
    public String toString() {
        return "\n" + "Order: " + this.orderID + "\n" + "Cost: " + this.cost + "\n" + "Date: " + this.date
                + this.orderType + "\n" + "Start Time: " + this.startTime + "\n" + "Order Address: "
                + this.orderAddress  + "\n" + "Dishes: " + this.dishesQuantity
                + "\n" + "Guests: " + this.guestsQuantity+ "\n";
    }
}