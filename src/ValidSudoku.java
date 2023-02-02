import java.util.*;


public class ValidSudoku {

    public static boolean validSudoku(char[][] board){


        for(int i=0; i<board.length; i++) {
            Set<Character> set1= new HashSet<>();
            Set<Character> set2= new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                char ch = board[i][j];
                char ch2= board[j][i];
                if(ch !='.')  {
                    if(set1.contains(ch)){ return false;}
                    set1.add(ch);
                }
                if(ch2!='.'){
                if(set2.contains(ch2)){return false;}
                set2.add(ch2);
                }
            }
        }


       /* for(int i=0; i<board.length; i=i+3) {
            for (int j = 0; j < board.length; j=j+3) {
                Set<Character> set3= new HashSet<>();
                for(int l=i, count=0;  count<3; count++, l++){
                    for(int k=j,cnt=0; cnt<3; cnt++,k++){

                        char ch = board[l][k];
                        if(ch =='.')  {
                            continue;
                        }
                        if(set3.contains(ch)) {return false;}
                        set3.add(ch);

                    }
                }

            }
        }
*/
        return true;

    }



    public static void main(String[] args) {

        char [][] board2 = {{'1','3','.','.','7','.','.','.','9'}
                           ,{'6','.','.','1','9','5','.','.','.'}
                           ,{'.','9','8','.','.','.','.','6','.'}
                           ,{'8','.','.','.','6','.','.','.','3'}
                           ,{'4','.','.','8','.','3','.','.','1'}
                           ,{'7','.','.','.','2','.','.','.','6'}
                           ,{'.','6','.','.','.','.','2','8','.'}
                           ,{'.','.','.','4','1','9','.','.','5'}
                           ,{'.','.','.','.','8','.','.','7','9'}};


        System.out.println(validSudoku(board2));
    }
}
