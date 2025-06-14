import java.util.*;

public class TreeMap_Demo {
    public static void main(String[] args) {
        TreeMap<Integer, String> orderMap = new TreeMap<>();
        orderMap.put(1003, "Order Received");
        orderMap.put(1001, "Processing");
        orderMap.put(10032, "Shipped");

        orderMap.forEach((id, status) -> System.out.println("Order" +id+ ": " + status));
    }
}
