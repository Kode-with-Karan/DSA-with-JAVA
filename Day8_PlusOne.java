/**
 * Day8_PlusOne
 */
public class Day8_PlusOne {

    public static int[] plusOne(int[] digits) {
        int[] ans = new int[digits.length+1];
        ans[digits.length] = 1;

        for (int i = digits.length-1 ; i>=0 ; i--) {
            int sum = ans[i+1]+digits[i];
            if(sum == 10){
                ans[i+1] = 0;
                ans[i] = 1;
            }else{
                ans[i+1] = sum;
            }
        }

        if(ans[0] == 0){
            for (int i = 1; i < ans.length; i++) {
                digits[i-1] = ans[i];
            }
            return digits;
        }else{
            return ans;
        }



    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,9,8};

        int[] ans = plusOne(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+", ");
        }
    }
}