
package kata2;

import java.util.Map;
import java.util.HashMap;

public class Kata2 {

    
    public static void main(String[] args) {
        int[] data = {0,-1,7,100,100,1,1,1,5,8,8,9,54,6,54};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    
    }
    
}
