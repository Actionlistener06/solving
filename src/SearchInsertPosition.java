public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target||target<nums[i]){
                return i;
            }


        }

        return nums.length;


    }

    public static void main(String[] args) {
       int[] nums = {1,3,5,6}; int target = 10;
       int[] nums2 = {1,3,5,6}; int target2 = 4;
        System.out.println(searchInsert(nums2,target2));
    }
}
