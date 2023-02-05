import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Main {



    public static void main (String[] args) {
        int[] digits = {4,3,2,1};
        int larger_integer=0;
        int lent= digits.length-1;

        for(int n=0;n<=digits.length-1;n++){
            larger_integer += digits[n] * Math.pow(10, lent);
            lent--;
        }
        System.out.println(larger_integer);
        // keep this function call here

        HashMap<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

    }

}