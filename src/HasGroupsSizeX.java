import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description:卡牌分组
 * @author: LeeXy
 * @create: 2020-03-27 21:17
 **/

public class HasGroupsSizeX {
    public static boolean solution(int[] deck){
        List<Integer> target = new ArrayList<>();
        int length = 1;
        boolean flag = false;
        if(deck==null||deck.length==1){
            return flag;
        }

        for(int index = 0;index<deck.length;index++){
            for (int index1 = index+1;index1< deck.length;index1++){
                if(deck[index]>deck[index1]){
                    int temp =deck[index];
                    deck[index] = deck[index1];
                    deck[index1] = temp;
                }
            }
        }
        //处理特殊情况 全部一样
        if(deck[0]==deck[deck.length-1]){
            return flag= true;
        }
        for (int i = 0; i < deck.length-1; i++) {
            //寻找最短重复数字数组长度
            if(deck[i]==deck[i+1]){
                length++;
            }else {
                target.add(length);
                length=1;
            }
            if(i==deck.length-2){
                target.add(length);
            }
        }
        target.forEach(integer -> System.out.println(integer));
//        查看是否有最大公约数，有则能够
        int flag1 = ngcd(target,target.size());

        return flag1==1 ? flag:true;
    }

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y , x % y);
    }
    public static int ngcd(List<Integer> target , int z) {
        if(z == 1) {
            return target.get(0);
            //真正返回的最大公约数
        }
        //递归调用，两个数两个数的求
        return gcd(target.get(z - 1) , ngcd(target , z - 1));
    }

    public static void main(String[] args) {
        int []deck = new int[]{1,1,2,2,2,2,};
        final boolean solution = solution(deck);
        System.out.println(solution);
    }
}
