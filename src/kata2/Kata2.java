
package kata2;

import java.util.Map;
import java.util.HashMap;

public class Kata2 {

    
    public static void main(String[] args) {
        String[] data = {"Pepe","María","Marlom","Pepe","José","Pepe"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (String key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    
    }
    
}
