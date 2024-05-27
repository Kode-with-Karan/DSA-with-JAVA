public class Day7_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;


        for(int i=0;i<nums.length;i++){

            if(val!=nums[i]){

                

                nums[count] = nums[i];

                count = count+1;
 

            }


        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] ={1,1,2,2,3,4,4};
        System.out.println(removeElement(arr,2));
    }
}
