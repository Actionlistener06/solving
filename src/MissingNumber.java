import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MissingNumber {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){return i;}
        }
        return nums.length;
    }
}

