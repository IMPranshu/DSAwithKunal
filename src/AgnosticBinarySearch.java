public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,3,4,5,7,12,13,18,19,22};
        int[] arr2 = {22,21,20,18,17,15,12,10,8,7,4,1};
        int target = 7;
        System.out.println(agnosticBS(arr2, target));
    }
    static int agnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(arr[start] > arr[end]){
            while(start  <= end){
                int mid= start + (end - start)/2;
                if(arr[mid] < target){
                    end = mid-1;
                }
                else if(arr[mid] > target){
                    start = mid+1;
                }
                else if(arr[mid] == target) {
                    return mid;
                }
            }

        }
        else if (arr[start] < arr[end]){
            while(start  <= end){
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
        }

        return -1;

    }
}
