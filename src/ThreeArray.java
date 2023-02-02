import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeArray {

    public static void presentTwoElements(int[] A, int[] B, int[] C){

        List<Integer> AA = Arrays.stream(A).boxed().toList();
        List<Integer> BB = Arrays.stream(B).boxed().toList();
        List<Integer> CC = Arrays.stream(C).boxed().toList();


        Set<Integer> result = Stream.of(AA, BB, CC).flatMap(Collection::stream)
                .filter(x -> (AA.contains(x) && BB.contains(x)) ||
                        (AA.contains(x) && CC.contains(x)) ||
                        (CC.contains(x) && BB.contains(x))
                )
                .collect(Collectors.toSet());

        System.out.println(result);
        

    }

    public static void main(String[] args) {
        int[] A ={2,5,3,2,8,1};
        int[] B ={7,9,5,2,4,10,10};
        int[] C ={6,7,5,5,3,7};

        presentTwoElements(A,B,C);
    }
}