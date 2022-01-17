import java.lang.reflect.Array;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {3,1,2,4,5};


        for(int j =0;j<arr.length;j++) {
            int swap=findMax(arr.length - j,arr);
            int temp = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = arr[swap ];
            arr[swap] = temp;
        }
        for (int i = 0;i< arr.length;i++)
            System.out.println(arr[i]);


    }
    static int findMax(int end, int[] arr){
        int max = 0;
        for(int i = 1;i< end;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;

    }
}
