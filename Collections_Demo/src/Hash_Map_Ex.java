import java.util.*;
public class Hash_Map_Ex {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        hm.put("E101", "HR");
        hm.put("E102", "IT");
        hm.put("E103", "FINANCE");

        //Access by key
        System.out.println("E102 Department: " + hm.get("E102"));

        //Iterate
        for (Map.Entry<String, String> e : hm.entrySet()) {
            System.out.println("EMP ID: " + e.getKey() + ", Dept: " + e.getValue());
        }

        if (hm.containsKey("E101")) {
            System.out.println("EMP ID E101 exists: " + hm.get("E101"));
        }
    }
}
