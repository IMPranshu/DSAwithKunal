public class FindPosInInfiniteArray {
    public static void main(String[] args) {

    }

    static int findRange(int[] arr, int target){
        //first find the range
        //first start with a box of size 2
        int start =0;
        int end = 1;
        //condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            // ddouble the box value
            //end = previous end + (size of the box) * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target,start,end);
    }
    static int binarySearch(int[] arr, int target,int start, int end){



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
