package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BikeFactory {
    private static Map<String, IBike> mPool;

    public BikeFactory() {
        mPool = new HashMap<>();
    }

    public IBike getBike(String name) {
        if (mPool != null) {
            if (mPool.containsKey(name)) {
                System.out.println("共享单车押金已交，直接用车：" + name);
                return mPool.get(name);
            } else {
                ShareBike bike = new ShareBike();
                System.out.println("缴纳押金：100元，开始用车：" + name );
                mPool.put(name, bike);
                return bike;
            }
        }
        return null;
    }
}
