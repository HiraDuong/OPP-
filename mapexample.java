import java.util.HashMap;
import java.util.Map;

public class mapexample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Lo", "Cc");
        map.put("Lo1", "Cc2");
        map.put("Lo2", "Cc3");

        String s = map.get("Lo");

        System.out.println(s);
        System.out.println(map.containsKey("Lo1")
        );  
        System.out.println(map.keySet());
        System.out.println(map.values());


    }
}
