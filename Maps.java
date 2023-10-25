import java.util.LinkedHashMap;

public class Maps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hmap =new LinkedHashMap<>();
        hmap.put("a", 1);
        hmap.put("b", 2);
        hmap.put("c", 3);
        hmap.put("d", 4);
        hmap.put("e", 5);


        for (String val : hmap.keySet()) {
            System.out.println(val+" :"+hmap.get(val));
        }
    }
}
