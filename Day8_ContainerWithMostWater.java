public class Day8_ContainerWithMostWater{   
    
    public static int maxArea(int[] height) {
        int i = 0;

        int j = height.length-1;

        int max = Math.min(height[i],height[j])*(j-i);

        while(i<j){

           if(height[i]<height[j]){

               i++;

           }else{

               j--;
           } 

           int maxi = Math.min(height[i],height[j])*(j-i);

           max = Math.max(maxi,max);

        }

        return max;
    }
    
    public static void main(String args[]) {
      int[] arr = new int[]{3,4,5,6,1,2};

      System.out.println(maxArea(arr));
    }
}