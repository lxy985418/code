import java.util.Arrays;

/**
 * @program: LeetCode
 * @description:
 * @author: LeeXy
 * @create: 2020-03-31 22:15
 **/

public class SortAnArray {
    public static int[] solution(int []deck){
        Arrays.sort(deck);
        return deck;
    }

    public static void main(String[] args) {
       int deck[] = new int[]{5};
        final int[] solution = solution(deck);
        for(int i = 0 ; i<solution.length;i++){
            System.out.println(deck[i]);
        }

    }
}
