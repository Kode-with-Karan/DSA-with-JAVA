public class Search_in_rotated_array2 {
    public static void search(int arr[],int target){
        int s = 0;
        int e = arr.length-1;
        System.out.println(helperSearch(arr,target,s,e));
    }
    static boolean helperSearch(int arr[],int target,int s,int e){
        while (s<=e){
            int mid = s +(e-s)/2;
            if(target == arr[mid]){
                return true;
            }
            if(arr[mid] == arr[s]){
                s++;
                continue;
            }
            if(arr[mid]>arr[s]){
                if(target >= arr[s] && target<arr[mid]){
                    e = mid -1;
                }
                else {
                    s = mid +1;
                }
            }
            else{
                if(target > arr[mid] && target <=arr[e]){
                    s = mid +1;
                }
                else {
                    e = mid -1;
                }
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        int arr[] ={1,1,1,1,2,1,1,1};
        search(arr,2);
    }
}