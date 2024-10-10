import java.util.TreeMap;

public class treemap{
    public static void main(String[] args){
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("apple",5);
        tm.put("banana",2);
        tm.put("orange",3);

        System.out.println(tm);
    }
}