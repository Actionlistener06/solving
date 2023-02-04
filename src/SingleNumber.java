import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber( new int[]{4, 1, 2, 1, 2}));
    }
    public int singleNumber(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i=i+3){
            if (nums[i] != nums[i +1] ||nums[i]!=nums[i+2] ) {
                return nums[i];
            }
        }
        return nums[nums.length-1];

    }

   /* public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i=i+2){
            if (nums[i] != nums[i +1]  ) {
                return nums[i];
            }
        }
        return nums[nums.length-1];


    }*/
}
