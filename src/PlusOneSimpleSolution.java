import java.util.Arrays;

public class PlusOneSimpleSolution {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        int[] digits2={9,8,7,6,5,4,3,2,1,0} ;
        int[] output = new PlusOne().plusOne(digits2);
        System.out.println(Arrays.toString(output));

    }

    public int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--) {
            if (digits[i]!=9){
                ++digits[i];
                return digits;
            }
            else{
                digits[i] =0;
            }
        }
        int[] digits2= new int[digits.length+1];
        digits2[0]=1;
        return digits2;



    }
}
