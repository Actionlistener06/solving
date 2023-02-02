import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        Long larger_integer= 0L;
        int lent= digits.length;
        for(int n=0;n<digits.length;n++){
            --lent;
            larger_integer += (long) digits[n] *  (long)Math.pow(10, lent);
        }
        larger_integer=larger_integer+1L;
        Long temp=larger_integer;
        int sayac=0;
        while(temp > 0) {
            temp /= 10L; // sayi = sayi / 10;
            sayac++;
        }

        List<Integer> output_list = new ArrayList<>();
        Long t=0L;
        int intt=0;
        for(int i=sayac-1;i>=0;i--) {
             t= (long) Math.pow(10,i);
             intt = (int) (larger_integer/t);
            larger_integer -= t * intt;
            output_list.add(intt);
        }
        int[] output_array= output_list.stream().mapToInt(Integer::intValue).toArray();
        return output_array;
    }

    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        int[] digits2={9,8,7,6,5,4,3,2,1,0} ;
        int[] output = new PlusOne().plusOne(digits2);
        System.out.println(Arrays.toString(output));

    }
}
