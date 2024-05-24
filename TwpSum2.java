public class TwpSum2 {
    public static int[] prob(int[] numbers, int target){
        int start = 0;

        int end = numbers.length-1;

        int[] ans = new int[]{-1,-1};

        int sum = 0;

        

        while(start<end){

            

            sum = numbers[start]+numbers[end];

            

            if(sum>target){

                end = end - 1;

            }else if(sum<target){

                start = start + 1;

            }else if(sum==target){

                ans[0] = start+1;

                ans[1] = end+1;

                break;

            }


        }

        return ans;
    }


    
    public static void main(String args[]) {
      int[] arr = new int[]{3,4,5,6,1,2};

      for(int i=0;i<2;i++){
          System.out.println(prob(arr,4)[i]);
      }
    }
}
