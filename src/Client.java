public class Client extends User {

    int clientOrderID;
    String clientAddress;

    public Client(int clientOrderID, String clientAddress, String clientName, String clientPhoneNumber) {
        super(clientName, clientPhoneNumber);
        this.clientOrderID = clientOrderID;
        this.clientAddress = clientAddress;
    }

    @Override
    public String toString() {
        return "\n" + "Client: " + this.userName + "\n" + "Order ID: " + this.clientOrderID
                + "\n" + "Phone number: " + this.phoneNumber +  "\n"
                + "Address: " + this.clientAddress + "\n";
    }
}
