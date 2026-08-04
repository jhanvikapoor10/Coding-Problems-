import java.util.*;
public class Main{
    public static String startingElement(HashMap<String, String> tick){
        
        //hashMap 2 (Reverse hshmap, it is possible for this question as each to city has one from city so keys will stay unique in both the maps)
        HashMap<String, String> rev = new HashMap<>();
        for(String key : tick.keySet()){
            rev.put(tick.get(key), key);
        }
        
        //traverse the tick keys to find what city is present in one of the map's keys only as that will be the starting point
        for(String keys : tick.keySet()){
            if(!rev.containsKey(keys)){
                //System.out.println("The starting point is: "+keys);
                return keys;
            }
        }
        return null;
    }
    public static void main(String[] args){
        //HashMap 1 (Original hashmap)
        HashMap<String, String> tick = new HashMap<>();
        tick.put("Chennai", "Bengaluru");
        tick.put("Mumbai", "Delhi");
        tick.put("Goa", "Chennai");
        tick.put("Delhi", "Goa");
        String start = startingElement(tick);
        while(tick.containsKey(start)){
            System.out.print(start+" --> ");
            start = tick.get(start);
        }
        System.out.println(start);
    }
}
