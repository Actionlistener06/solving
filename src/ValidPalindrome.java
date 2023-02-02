import java.util.Locale;

public class ValidPalindrome { public static boolean isPalindrome(String s) {

    s=s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

    for(int i=0, j=(s.length()-1); i<j; i++,j--){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
