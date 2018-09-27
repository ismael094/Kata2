
package kata2;

import java.util.Map;
import java.util.HashMap;

public class Kata2 {

    
    public static void main(String[] args) {
        int[] data = {0,-1,7,100,100,1,1,1,5,8,8,9,54,6,54};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    

    }
    
}
