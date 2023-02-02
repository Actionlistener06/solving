import java.util.HashSet;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){

            boolean equals = String.valueOf(s.charAt(i)).equals(" ");
            if(count>0&& equals){return count;}

            if(!equals){
                count++;
            }
            if(i==0){return count;}

        }

        return s.length();


    }

    public static void main(String[] args) {
        String s = "a ";
        System.out.println(lengthOfLastWord(s));
    }
}
