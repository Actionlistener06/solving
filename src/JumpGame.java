public class JumpGame {

    public static boolean canJump(int[] nums){

        int jump =1;
        while(jump<nums.length){
            if(nums.length==2&&nums[0]!=0){return true;}
            jump=jump+nums[jump];
            if(nums[jump]==0&&(nums[jump - nums[jump]]>1)){  jump=(jump - nums[jump])-1; }
            else if(nums[jump]==0&&(nums[jump - nums[jump]]<=1)){return false;}




        }


        return true;}

    public static void main(String[] args) {



        int [] nums = {2,3,1,1,4}; //true
        int [] nums2 = {2,5,0,0}; //false
        int[] nums3= {1,3,0,0,0,1};
        System.out.println(canJump(nums3));
    }
}
