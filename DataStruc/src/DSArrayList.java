import java.util.ArrayList;
import java.util.Scanner;

public class DSArrayList {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(7);
        nums.add(10);

        for(int i: nums){
            System.out.print(i + " ");
        }
    }
}

