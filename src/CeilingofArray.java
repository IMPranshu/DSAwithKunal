//Program to find ceiling of an array.
//Ceiling is equal to the smallest number greater than or equal to the target in our array

// This program can be easily solved by using Binary Search


public class CeilingofArray {
    public static void main(String[] args) {
        int arr[]= {1,2,4,6,7,15,67,99};
        int[] arr2 = {22,21,20,18,17,15,12,10,8,7,4,1};
        int target = 19;
        System.out.println(ceilingUsingBS(arr2,target));

    }

    static int ceilingUsingBS(int[] arr, int target){
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
                    return arr[mid];
                }
            }
            return arr[end];

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
                    return arr[mid];
                }
            }
            return arr[start];
        }
        return -1;

    }
}
