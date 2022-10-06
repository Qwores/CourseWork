import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Make Client data-type objects
        Client c1 = new Client(3165, "zalupa street", "Xuylo", "+380680987375");
        //Client c2 = new Client();
        //Client c3 = new Client();
        //Client c4 = new Client();

        //Declare array

        ArrayList  <Client> names = new ArrayList<>();

        //adding objects to ArrayList
        names.add(c1);
        //names.add(c2);
        //names.add(c3);
        //names.add(c4);

        // Print and display the elements of adobe ArrayList
        // using get() method
        System.out.println(names.get(0).clientName);
        System.out.println(names.get(0).clientAddress);
        System.out.println(names.get(0).clientOrderID);
        System.out.println(names.get(0).clientPhoneNumber);
    }
}