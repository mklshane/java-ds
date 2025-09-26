import java.util.LinkedHashSet;

public class DSSet {

    public static void hash(int[] arr) {
        // var set = new HashSet<Integer>(); //unordered unique set of numbers
        // var set = new TreeSet<Integer>(); // stores uniques elements in sorted order
        var set = new LinkedHashSet<Integer>(); // stores unique elements and remembers the order they were added

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for(Integer i: set){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {23, 66, 75, 5, 24, 5, 1, 346, 23, 1, 7};
        hash(nums);
    }

}
