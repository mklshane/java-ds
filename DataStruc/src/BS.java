import java.util.Arrays;

public class BS {
    public static int binarySearch(int[] arr, int val){
        int left = 0;
        int right = arr.length-1;



        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == val){
                return mid;
            }
            else if(val < arr[mid]){
                right = mid - 1;
            } else if (val > arr[mid]){
                left = mid + 1;
            }
        }
        return -1;



    }

    public static void main(String[] args) {
        int[] nums = {45, 243, 675, 23, 56, 76};
        Arrays.sort(nums);
        System.out.println("Value is found at index: " + binarySearch(nums, 76));
    }
}
