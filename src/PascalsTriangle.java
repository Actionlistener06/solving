import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {


    public List<List<Integer>> generate(int numRows){
            List<Integer> list1= new ArrayList<>();
            List<List<Integer>> list2=new ArrayList<>();



        for(int i=0;i<numRows;i++){
            list1.add(0,1);

            for(int j=1;j<list1.size()-1;j++){
                int k=list1.get(j)+list1.get(j+1);
                list1.set(j,k);
                list2.add(new ArrayList<Integer>(list1));

            }

        }
        return list2;
    }

    public static void main(String[] args) {

        System.out.println((new PascalsTriangle().generate(5)).toString());
    }
    
}
