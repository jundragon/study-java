import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayGround {

    @Test
    public void pg() {
        String s = "java.lang.Object";
        String c = s.substring(10);
        System.out.println(c);

        StringBuffer b = new StringBuffer("hoho");

        Map<String, Integer> map = new HashMap<>();
        map.put("ha", 2);
        map.put("ho", 3);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

    }
}
