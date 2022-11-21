public class Client extends User {

    int clientOrderID;
    String clientAddress;

    public Client(int clientOrderID, String clientAddress, String clientName, String clientPhoneNumber) {
        super(clientName, clientPhoneNumber);
        this.clientOrderID = clientOrderID;
        this.clientAddress = clientAddress;
    }

    public String getClientName(){
        return this.userName;
    }

    public int getClientOrderID(){
        return this.clientOrderID;
    }

    @Override
    public String toString() {
        return this.userName + this.clientOrderID + this.phoneNumber + this.clientAddress;
    }
}
