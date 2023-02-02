import java.util.stream.Stream;

public class Palindrome {

    public static boolean isPalindrome(int x){

        String y=String.valueOf(x);

        for(int i=0, j=(y.length()-1); i<j; i++,j--){
            if(y.charAt(i)!=y.charAt(j)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(323323));
    }
}
