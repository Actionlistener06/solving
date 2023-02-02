
import java.util.*;


public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {


        List<Integer> list = Arrays.stream(nums).boxed().distinct().toList();

        return (list.size()!=nums.length);


    }
    public static void main (String[] args){
        int[] numss = new int[]{1, 8, 4, 6, 3, 5};

        System.out.println(containsDuplicate(numss));
    }
}




