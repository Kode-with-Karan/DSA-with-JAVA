public class Maximum_product_subarray {
    
    public static int prob(int[] nums){
        int smult = 1;
        int emult = 1;
        int maxi = nums[0];
        
        for(int i=0; i<nums.length; i++){
            

            if(smult == 0){
                smult = 1;
            }
            if(emult == 0){
                emult = 1;
            }
            
            smult = smult*nums[i];
            emult = emult*nums[nums.length-1-i];
            
            maxi = Math.max(maxi,Math.max(smult,emult));
        }
        return maxi;
    }
    
    public static void main(String args[]) {
      int[] arr = new int[]{2,3,-2,4};

      System.out.println(prob(arr));
    }
}