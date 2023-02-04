import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int a:nums){
            if(!map.containsKey(a)){map.put(a,1);}
            else{
                map.put(a, map.get(a)+1);
            }
            if(map.get(a)>nums.length/2){return a;}
        }
        return 0;
    }
}
