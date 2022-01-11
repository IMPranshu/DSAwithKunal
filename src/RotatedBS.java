public class RotatedBS {
    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = findPivot(nums);

        int ans = binarySearch(nums, target, 0, pivot);
        if(ans != -1){
            System.out.println(ans);
        }
        ans = binarySearch(nums, target, pivot + 1, nums.length - 1);
        System.out.println(ans);

    }


   static int binarySearch(int[] nums, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }


    static int findPivot(int[] nums){


        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;

            }
            if(mid > start && nums[mid - 1] > nums[mid]){
                return mid-1;
            }
            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

}
