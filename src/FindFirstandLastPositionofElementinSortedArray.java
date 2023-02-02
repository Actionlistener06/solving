class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);
        return result;
    }

    public int findFirst (int [] nums, int target){
        int start=0;
        int end=nums.length-1;
        int idx=-1;
        while(start<end){

            int middle=(end-start)/2;
            if(target<nums[middle]){
                end=middle-1;}
            else if(target>nums[middle]){start=middle+1;}
            else if(target==nums[middle]){idx=nums[middle];}
        }
        return idx;
    }
    public int findLast(int[] nums, int target){
        int idx=findFirst(nums,target);
        if(idx==-1){return -1;}
        while(nums[idx+1]==target){
            idx++;
        }
        return idx;

    }
}