import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Make Client data-type objects
        Client c1 = new Client(3165, "blah street", "Vitaliy Kirieshkin", "+380680987375");
        Client c2 = new Client(3124, "idiot street", "Oleksii", "+380482347375");
        Client c3 = new Client(3165, "blah street", "Zhekich", "+380232347332");
        Client c4 = new Client(3435, "blah street", "Vova", "+384333347344");

        Order o1 = new Order(12, 25, "12412", 1430.11, "14.05.2022",
                "blahs street", "banquet", "14:00");
        Order o2 = new Order(12, 25, "12412", 1220.54, "15.05.2022",
                "blahblah street", "banquet", "14:00");
        Order o3 = new Order(12, 25, "12412", 1430.43, "16.06.2022",
                "blahblah street", "banquet", "14:00");
        Order o4 = new Order(12, 25, "12412", 11540.03, "17.08.2022",
                "blah street", "banquet", "14:00");


        //Declare arrays
        ArrayList  <Client> names = new ArrayList<>();
        ArrayList  <Order> orders = new ArrayList<>();

        //adding objects to ArrayList
        names.add(c1);
        names.add(c2);
        names.add(c3);
        names.add(c4);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);

        // Print and display the elements of adobe ArrayList
        // using get() method
        //System.out.println(names.get(0).clientName);

        //console module
        Scanner sc = new Scanner(System.in);

        String scanner;

        System.out.println("1.Список замовлень з … по….");
        System.out.println("2.Список клієнтів.");
        System.out.println("3.Найбільш популярний тип замовлення.");
        System.out.println("4.Середня кількість страв.");
        System.out.println("5.Найбільша вартість банкету.");
        System.out.println("6.Найбільш популярний час початку.");

        do {
            System.out.println("Choose operation <1>, <2>, <3>, <4>, <5>, <6> or <q> to quit");
            scanner = sc.nextLine();
            if(scanner.equals("1")){
                System.out.println(orders);
            }
            else if(scanner.equals("2")){
                System.out.println(names); //output names
            }
            else if(scanner.equals("3")){
                System.out.println("Task 3");
            }
            else if(scanner.equals("4")){
                System.out.println("Task 4");
            }
            else if(scanner.equals("5")){
                System.out.println("Task 5");
            }
            else if(scanner.equals("6")){
                System.out.println("Task 6");
            }
            else {  //edit to look better
                if (! scanner.equals("1") && ! scanner.equals("2")
                        && ! scanner.equals("3") && ! scanner.equals("4")
                        && ! scanner.equals("5") && ! scanner.equals("6") && ! scanner.equals("q")){
                    System.out.println("ERROR");
                }
            }
        } while (! scanner.equals("q"));
        System.out.println("done");


    }
}