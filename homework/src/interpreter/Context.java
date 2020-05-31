package interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Object> mMap = new HashMap<>();

    public void put(String key, Object value) {
        mMap.put(key, value);
    }

    public int get(String key) {
        return (int) mMap.get(key);
    }
}
