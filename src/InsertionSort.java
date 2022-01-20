import java.sql.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {3,5,1,4,2};

        for (int i = 0;i<=arr.length - 2;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = swap;
                }
                else break;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
