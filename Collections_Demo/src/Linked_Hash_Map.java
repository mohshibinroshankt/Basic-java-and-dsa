import java.util.LinkedHashMap;

public class Linked_Hash_Map {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> orderMap = new LinkedHashMap<>();
        orderMap.put(1001, "Order Received");
        orderMap.put(1002, "Processing");
        orderMap.put(1003, "Shipped");

        orderMap.forEach((id, status) -> System.out.println("Order:"+id + " " + status));



    }
}
