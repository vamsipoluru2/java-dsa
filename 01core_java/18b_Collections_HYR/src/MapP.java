import java.util.Map.Entry;
import java.util.*;

public class MapP {
    public static void main(String[] args) {
        //creation of map
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // retrival of kay value from map
        System.out.println(map);
        //retrivalof keys from the map
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println("Key: " + key);  


        }

        //retrival of values from the map
        Collection<String> values = map.values();
            for (String value : values) {
                System.out.println("Value: " + value);
            }    
        
        //retrival of key-value pairs from the map
        for(Integer key:keys){
            System.out.println(key+">>>"+map.get(key));
        }
        //deleation 
        map.remove(1);
        System.out.println(map);

        //updation
        map.put(2, "Two Updated");
        System.out.println(map);
        map.putIfAbsent(30,"Thirty");
        map.replace(2, "Two Updated", "Two Completely Updated");

        System.out.println(map);
 
        //verification of map in key
        boolean containsKey = map.containsKey(2);
        System.out.println("Contains key 2: " + containsKey);
        



        Set<Entry<Integer, String>> entries = map.entrySet();
        for(Entry<Integer, String> entry:entries){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+">>>"+value);
        }   

    }
}
