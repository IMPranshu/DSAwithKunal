public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {3,1,2,4,5};
        boolean swapped;

        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j= 1;j<arr.length - i;j++){
                if(arr[j-1] > arr[j]){
                    //swap
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = swap;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for (int i = 0;i<arr.length;i++)
        System.out.println(arr[i]);



    }



}
