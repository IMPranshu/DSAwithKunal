import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleSort {
    public static void main(String[] args) {

        int[] arr = {3,4,2,1};
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            //check
            if (arr[i] != arr[correct]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                //move
                i++;
            }
        }



        System.out.println(Arrays.toString(arr));
    }
}
