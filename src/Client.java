public class Client {

    int clientOrderID;
    String clientAddress;
    String clientName;
    String clientPhoneNumber;

    //constructor
    public Client(int clientOrderID, String clientAddress, String clientName, String clientPhoneNumber) {
        this.clientOrderID = clientOrderID;
        this.clientAddress = clientAddress;
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
    }

    //output ArrayList
    public String getClientName(){
        return clientName;
    }

    public int getClientOrderID(){
        return clientOrderID;
    }

    @Override
    public String toString() {
        //return clientName;
        return this.clientName + this.clientOrderID;
    }
}
