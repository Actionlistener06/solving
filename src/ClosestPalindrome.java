
public class ClosestPalindrome  {

public int closestPalindrome(int x){

        for(int i=1; !(Palindrome.isPalindrome(x)); i++) {
              int z = x + i;
              int y = x - i;
            if(Palindrome.isPalindrome(z)) {return z;}
            else if(Palindrome.isPalindrome(y)){return y;}
        }
        return 0;
}



    public static void main(String[] args) {
              ClosestPalindrome closestPalindrome= new ClosestPalindrome();
              int y= 323325;



        System.out.println(closestPalindrome.closestPalindrome(y));
    }
}
