import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_with_K_Uniques_GFG {

    public static int Longest_Substring_with_K_Uniques(String s, int k){
        int low = 0;
        int high = 0;
        int res = -1;
        Map<Character, Integer> freq = new HashMap<>();

        while(high < s.length()){
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c,0)+1);

            while(freq.size()>k){
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar) == 0){
                    freq.remove(leftChar);
                }
                low++;
            }

            if(freq.size() == k){
                int len = high-low+1;
                res = Math.max(res,len);
            }
            high++;
        }
        return res;
    }

    public static void main(String[] args){
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(Longest_Substring_with_K_Uniques(s, k));

    }
}
