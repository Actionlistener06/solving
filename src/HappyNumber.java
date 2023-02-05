import static java.lang.Math.pow;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));

    }

    public boolean isHappy(int n) {
        String n2 = String.valueOf(n);
        int a=0;
        for (int i = 0; i < n2.length(); i++) {
         a+= happy(n2.charAt(i));
        }
        if(a==n){return false;}
        if(a==1){return true;}

       return isHappy(a);

    }
    private int happy(Character c){
        int n=0;
        n+= (int) (pow(c,2));

        return n;
    }

}