import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        String result = "";
        int a_pointer=0;
        int b_pointer=0;

        List<String> strings = Arrays.asList(strs);
        String minest = strings.stream().
                min(Comparator.comparingInt(String::length)).get();
        int min = minest.length();

        for(int i = 0; min > i; i++){
            for(int j=1;j<strs.length;j++){
               boolean ok= String.valueOf(strs[0].charAt(i)).equals(String.valueOf(strs[j].charAt(i)));
               if(!ok) return result;

            }
           result= result.concat(String.valueOf(strs[0].charAt(i)));

        }

            return result;


    }

    public static void main(String[] args) {

       String[] strs = {"flower","flow","flight"};


        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }
}

