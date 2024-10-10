import java.util.HashMap;

public class hashmap{
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Apple",1);
        hm.put("Orange",2);
        hm.put("Apple",2);
        //Updates value with most recent entry
        System.out.println(hm);
    }
}