import java.util.PriorityQueue;

public class DSPriorityQueue {

    public static int findKthLargest(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i: arr){
            minHeap.add(i);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 3;
        System.out.printf("%d largest element is " + findKthLargest(nums, k), k);
    }
}
