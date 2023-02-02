
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveElement {
    //Solution 1
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int n : nums)
            if (n != val)
                nums[i++] = n;
        return i;
    }
    //Solution 2
    public static int[] removeElement2(int[] nums, int val){
        int bef=nums.length;
        nums = Arrays.stream(nums)

                .filter(x -> x != val)

                .toArray();

       return nums;

    }



    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2} ;
        int val = 2;


        System.out.println(Arrays.toString(removeElement2(arr, val)));
    }
}
