import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    static ArrayList  <Client> clients = new ArrayList<>();
    static ArrayList  <Order> orders = new ArrayList<>();
    static ArrayList  <Admin> admins = new ArrayList<>();

    public static void main(String[] args) {

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
                        clients.add(obj1);
                        break;
                    case "Admin":
                        Admin obj2 = new Admin(findFile[1], findFile[2], findFile[3]);
                        admins.add(obj2);
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
                orderList();
            }
            else if(scanner.equals("2")){
                clientList();
            }
            else if(scanner.equals("3")){
                mostPopularType();
            }
            else if(scanner.equals("4")){
                System.out.println("Середня кількість страв: ");
                averageDishesQuantity();
            }
            else if(scanner.equals("5")){
                System.out.println("Найбільша вартість банкету: ");
                mostExpensive();
            }
            else if(scanner.equals("6")){
                mostPopularTime();
            }
            else {
                if (! scanner.equals("q") && !  scanner.equals("Q")){
                    System.out.println("ERROR");
                }
            }
        } while (! scanner.equals("q") && !  scanner.equals("Q"));
        System.out.println("done");
    }

    static public void averageDishesQuantity(){
        int amountSum = 0;
        for (Order order: orders){
            amountSum += orders.size();
        }

        double average = 0d;

        try {
            average = (amountSum/orders.size()) * 1.0;
        } catch (ArithmeticException e){
            System.err.println();
        }
        System.out.println(average);
    }

    static public void mostExpensive(){
        int max = 0;
        for (Order order: orders){
            int price = order.cost;
            if (price > max){
                max = price;
            }
        }
        System.out.println(max);
    }

    static public void mostPopularType(){
        HashMap<String, Integer> type = new HashMap<>();
        Map.Entry<String, Integer> max = null;
        for (Order order: orders){
            if (!type.containsKey(order.orderType)){
                type.put(order.orderType, 1);
            }
            else {
                type.put(order.orderType, type.get(order.orderType) + 1);
            }
        }
        for (Map.Entry<String, Integer> temp: type.entrySet()){
            if (max == null || temp.getValue() > max.getValue()){
                max = temp;
            }
        }
        if (max != null){
            System.out.println("Найбільш популярний тип замовлення: " + max.getKey());
        }
        else System.out.println("Нема замовлень");
    }

    static public void mostPopularTime(){
        HashMap<String, Integer> type = new HashMap<>();
        Map.Entry<String, Integer> max = null;
        for (Order order: orders){
            if (!type.containsKey(order.startTime)){
                type.put(order.startTime, 1);
            }
            else {
                type.put(order.startTime, type.get(order.startTime) + 1);
            }
        }
        for (Map.Entry<String, Integer> temp: type.entrySet()){
            if (max == null || temp.getValue() > max.getValue()){
                max = temp;
            }
        }
        if (max != null){
            System.out.println("Найбільш популярний час початку: " + max.getKey());
        }
        else System.out.println("Нема замовлень");
    }

    static public void  orderList(){

        Scanner scDate = new Scanner(System.in);

        int[] date1 = new int[] {0, 0, 0};
        int[] date2 = new int[] {0, 0, 0};

        System.out.println("Input date in dd.mm.yyyy format");
        System.out.println("Input first date: ");
        date1[0] = scDate.nextInt();
        date1[1] = scDate.nextInt();
        date1[2] = scDate.nextInt();
        System.out.println(Arrays.toString(date1));

        System.out.println("Input second date: ");
        date2[0] = scDate.nextInt();
        date2[1] = scDate.nextInt();
        date2[2] = scDate.nextInt();
        System.out.println(Arrays.toString(date2));

        System.out.println("Список замовлень з: " + Arrays.toString(date1) + "по: " + Arrays.toString(date2));
    }

    static public void clientList(){
        System.out.println(clients);
        System.out.println("-----------------------");
        System.out.println(orders);
    }
}