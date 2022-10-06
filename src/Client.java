public class Client {

    int clientOrderID;
    String clientAddress;
    String clientName;
    String clientPhoneNumber;

    //constructor
    Client(int clientOrderID, String clientAddress, String clientName, String clientPhoneNumber) {
        this.clientOrderID = clientOrderID;
        this.clientAddress = clientAddress;
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
    }
}
