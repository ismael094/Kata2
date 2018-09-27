package kata2;

import java.util.HashMap;
import java.util.Map;


public class Histogram {
    
    private final int[] data;
    
    public Histogram(int[] j) {
        data = new int[j.length]; 
        for (int i = 0;i<j.length;i++) {
            data[i] = j[i];
        }
    }
    
    public int[] getData() {
        int[] aux = new int[data.length]; 
        for (int i = 0;i<data.length;i++) {
            aux[i] = data[i];
        }
        return aux;
    }
    
    public Map<Integer,Integer> getHistogram() {
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}
