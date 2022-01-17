public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50}};
        int target = 37;

        System.out.println(binaryS2D(arr,target));


    }
    static int binaryS2D(int[][] arr, int target){

        int upb = 0;
        int lob= 3;

        while(upb <= 3 && lob >= 0) {

            if (arr[upb][lob] == target) {
                return arr[upb][lob];
            } else if (arr[upb][lob] < target) {
                upb++;
            } else {
                lob--;
            }
        }
        return -1;
    }


}

