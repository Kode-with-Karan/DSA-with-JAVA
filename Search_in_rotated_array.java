public class Search_in_rotated_array{   
    
    public static int prob(int[] nums, int target){
        int start = 0;

        int end = nums.length-1;

        int mid = start + (end - start)/2;

        int ans = -1;
        
        if(end == 0){
            if (nums[0] == target){
                ans = 0;
            }
        }else{

        while(start<end){

            

            

            if(nums[mid]>nums[end]){

                start = mid +1;

            }else{

                end = mid;

            }

            

            mid = start + (end - start)/2;

           

        }
        
        if(mid == 0){
            start = 0;

            end = nums.length-1;
        
        }else if(nums[0]<=target&&nums[mid-1]>=target){
            
            start = 0;
            end = mid - 1;
            
        }else{
            
            start = mid;
            end = nums.length - 1;
        }
        
        mid = start + (end - start)/2;
        
        while(start<=end){
            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid]<target){
                start = mid + 1;
            }else{
                end = mid-1;
            }
            mid = start + (end - start)/2;
        }
        }

         return ans; 
    }


    
    public static void main(String args[]) {
      int[] arr = new int[]{3,4,5,6,1,2};

      System.out.println(prob(arr,4));
    }
}