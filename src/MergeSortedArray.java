import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSortedArray {
    //Solution 1
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int[] arr=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i]=nums2[i];
        }
       nums1= Arrays.stream(arr).sorted().toArray();
        for(int a:nums1){
            System.out.println(a);
        }

    }
    //Solution 2

    public void merge2(int[] nums1,int m,int[] nums2,int n){

        int[] ans = IntStream.concat((getStream(nums1,m)),(getStream(nums2,n))).sorted().toArray();
     //  List<Integer> list= IntStream.concat((getStream(nums1,m)),(getStream(nums2,n))).boxed().toList();
       // System.out.println(list.toString());
      //  System.out.println( Arrays.asList(ans));
        System.arraycopy(ans, 0, nums1, 0, ans.length);

    }
    private IntStream getStream(int[] nums, int len){
        // return Arrays.stream( Arrays.copyOf(nums, len) );
        return Arrays.stream(nums, 0, len);
    }

    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int m = 3;
       int[] nums2 = {2,5,6} ;
        int n = 3;

        new MergeSortedArray().merge2(nums1,3,nums2,n);
    }

}
