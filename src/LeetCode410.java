public class LeetCode410 {
    public static void main(String[] args) {

        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums,m));


    }
    static int splitArray(int[] nums, int m) {
        int max = 0;
        int min = 0;
        for(int i = 0;i<=nums.length-1;i++){
            max += nums[i];
            min = Math.max(min, nums[i]);
        }
        int ans = binaryS(nums,min, max, m);
        return ans;
    }

    static int binaryS(int[] nums,int start, int end, int m){

        while(start <= end){

            int mid = start + (end - start) / 2;
            int p = 0, i=0;

            while(i<= nums.length - 1){
                int sum = 0;
                while( i < nums.length && (sum+nums[i]) <= mid){
                    sum += nums[i];
                    i++;
                }
                p++;
            }
            if(p <= m){
                end = mid;
            }
            else{
                start = mid + 1;
            }
            if(start == mid && mid == end){
                return start;
            }


        }
        return -1;
    }
}
