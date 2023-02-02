import java.util.*;

public class FirstOccurrenceinaString {
    public static int strStr(String haystack,String needle) {


        int a_pointer = 0;
        int b_pointer = 0;
        int i=0;
        while (b_pointer<haystack.length()){
            if(haystack.substring(a_pointer, b_pointer).equals(needle)){return a_pointer;}

            else if(haystack.charAt(a_pointer)==needle.charAt(i)) {
                b_pointer++;
                if ((b_pointer - a_pointer > needle.length())) {
                    a_pointer++;
                }
            }
            else{ i++;}

        }

        return -1;




    }




    public static void main(String[] args) {
        String haystack = "sassadsad"; String needle = "sad";
        String haystack1 = "leetcode"; String needle1 = "leeto";
        System.out.println(strStr(haystack,needle));

    }
}
