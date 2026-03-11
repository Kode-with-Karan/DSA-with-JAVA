package slidingWindow;

public class Minimum_Window_Substring_76 {

    public static Boolean sahi(int[] have, int[] need){
        for(int i =0; i<256; i++){
            if(have[i]<need[i]){
                return false;
            }
        }
        return true;
    }
    public static String minWindow(String s, String t) {
        int low = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int[] have =  new int[256];
        int[] need = new int[256];

        for(int i = 0 ; i<t.length(); i++){
            need[t.charAt(i)]++;
        }

        for(int high = 0; high<s.length(); high++){
            have[s.charAt(high)]++;
            while(sahi(have,need)){
                int len = high-low+1;
                if(minLen>len){
                    minLen = len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }

        if(minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start+minLen);

    }

    public static void main(String[] args){
        System.out.println(minWindow("karan", "tt"));
    }
}
