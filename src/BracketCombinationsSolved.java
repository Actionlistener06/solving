import java.util.Scanner;

class BracketCombinationsSolved {

    public static int BracketCombinations(int num) {
        return fact(num*2)/(fact(num+1)*fact(num));
    }

    public static int fact(int num) {
        int fac = 1;

        for(int i = 1; i<=num; i++){
            fac=fac*i;
        }
        return fac;
    }


    public static void main (String[] args) {
        // keep this function call here

        Scanner s = new Scanner(System.in);


        System.out.println(BracketCombinations(s.nextInt()));
    }

}