public class Mini_rotated_array{   
    
    public static int prob(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end-start)/2;
        
        while(start<end){
            

            if(nums[mid]>nums[end]){
                start = mid + 1 ;
            }else{
                end = mid;
            }

            mid = start + (end-start)/2;
        }
        return nums[mid];
    }
    
    public static void main(String args[]) {
      int[] arr = new int[]{3,4,5,6,1,2};

      System.out.println(prob(arr));
    }
}