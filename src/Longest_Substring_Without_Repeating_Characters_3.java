import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters_3 {

    public static int Longest_Substring_Without_Repeating_Characters(String s){
        int low = 0;
        int high = 0;
        int res = -1;
        Map<Character, Integer> freq = new HashMap<>();

        while(high < s.length()){
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c,0)+1);

            int k = high-low+1;
            while(freq.size() < k){
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar) == 0){
                    freq.remove(leftChar);
                }
                low++;
                k = high-low+1;
            }

            res = Math.max(res, high-low+1);
            high++;
        }
        return res;
    }

    public static void main(String[] arg){
        String s = "abcabcbb";
        System.out.println(Longest_Substring_Without_Repeating_Characters(s));
    }
}
