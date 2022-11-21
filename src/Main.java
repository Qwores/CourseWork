import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList  <Client> clients = new ArrayList<>();
        ArrayList  <Order> orders = new ArrayList<>();
        ArrayList  <Admin> admins = new ArrayList<>();

        //file reader
        try {
            File database = new File("base.txt");
            Scanner scan = new Scanner(database);
            while (scan.hasNextLine()){
                String data = scan.nextLine();
                String[] findFile = data.split("@");

                switch (findFile[0]){
                    case "Client":
                        Client obj1 = new Client(Integer.parseInt(findFile[1]), findFile[2], findFile[3], findFile[3]);
                        clients.add(obj1); // this
                        break;
                    case "Admin":
                        Admin obj2 = new Admin(findFile[1], findFile[2], findFile[3]);
                        admins.add(obj2); // this
                        break;
                    case "Order":
                        Order obj3 = new Order(Integer.parseInt(findFile[1]), Integer.parseInt(findFile[2]),
                                findFile[3], Integer.parseInt(findFile[4]), findFile[5], findFile[6], findFile[7], findFile[8]);
                        orders.add(obj3);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //console
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
                System.out.println(orders); // хуйня переделать
            }
            else if(scanner.equals("2")){
                System.out.println(clients);
                System.out.println(orders);
                System.out.println(admins);
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
            else {
                if (! scanner.equals("q") && !  scanner.equals("Q")){
                    System.out.println("ERROR");
                }
            }
        } while (! scanner.equals("q") && !  scanner.equals("Q"));
        System.out.println("done");


    }
}