public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1,3,4,5,7,12,13,18,19,22};
        int target = 7;
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while(start  < end){
            int mid= start + (end - start)/2;
            if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }




}
