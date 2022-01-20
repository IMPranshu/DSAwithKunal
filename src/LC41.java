import java.util.Arrays;

public class LC41 {
    public static void main(String[] args) {
        int[] arr = {9,10,12,11};
        firstMissingPositive(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        if (nums.length == 1) {
            if (nums[i] != i + 1) {
                return i + 1;
            } else
                return i + 2;
        } else {
            while (i < nums.length) {
                //ignore greater than N and -ve nos.
                if (nums[i] > nums.length || nums[i] < 1) {
                    i++;
                } else {
                    int correct = nums[i] - 1;
                    if (nums[i] != nums[correct]) {
                        //swap
                        int temp = nums[i];
                        nums[i] = nums[correct];
                        nums[correct] = temp;
                    } else {
                        i++;
                    }
                }
            }
            i = 0;
            while (i < nums.length) {
                if (nums[i] != i + 1) {
                    return i + 1;
                }
                i++;
            }
        }
        return -1;
    }
}
