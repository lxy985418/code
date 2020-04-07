import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode
 * @description:单词的压缩编码
 * @author: LeeXy
 * @create: 2020-03-28 23:31
 **/

public class MinimumLengthEncoding {
    public static int solution(String[] words){
        //解法思路：将字符串按照从小到大的顺序排序
        //小的依次比较长度较大的 如果为他的子串 就将小的删除然后长度+1（#）
        Set<String> set = new HashSet<>(Arrays.asList(words));
        //
        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                set.remove(word.substring(i));
            }
        }
        System.out.println(set);
        int ans = 0;
        for (String word : set) {
            ans += word.length() + 1;
            System.out.println(word);
        }
        return ans;
    }


    public static void main(String[] args) {
        String[] words = new String[]{"time", "me", "bell"};
        final int solution = solution(words);
        System.out.println(solution);
    }
}
