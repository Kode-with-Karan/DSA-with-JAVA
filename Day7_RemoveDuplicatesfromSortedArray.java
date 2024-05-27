public class Day7_RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int same = -101;

        int count = 0;

        for(int i=0;i<nums.length;i++){

            if(same!=nums[i]){

                same = nums[i];

                nums[count] = same;

                count = count+1;

            }

        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] ={1,1,2,2,3,4,4};
        System.out.println(removeDuplicates(arr));
    }
}
