
package kata2;

import java.util.Map;
import java.util.HashMap;

public class Kata2 {

    
    public static void main(String[] args) {
        int[] data = {0,-1,7,100,100,1,1,1,5,8,8,9,54,6,54};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        for (int i = 0;i<data.length;i++) {
            if (histogram.get(data[i]) != null) {
                histogram.put(data[i], histogram.get(data[i])+1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    

    }
    
}
