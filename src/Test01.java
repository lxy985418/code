import java.util.Scanner;

/**
 * @program: LeetCode
 * @description:
 * @author: LeeXy
 * @create: 2020-03-15 11:07
 **/

public class Test01 {
    public static int  Solution(int []nums){
        int account = 0;
        for(int i1 =0;i1<nums.length;i1++){
            for(int i2 =i1+1;i2<nums.length;i2++){
                if(nums[i2]>nums[i1]) {
                    for (int i3 = i2+1; i3 < nums.length; i3++) {
                          if(nums[i3]>nums[i2]&&nums[i2]>nums[i1]){
                              nums[i2]=-1;
                              account++;
                              break;
                          }
                    }
                }
            }
        }
        return account;
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int length = scanner.nextInt();
         int []nums = new int[length];
         scanner.nextLine();//防止回车提前终止
         String s = scanner.nextLine();
        String []snum = s.split(" ");
        for(int i =0;i<snum.length;i++){
            nums[i] = Integer.parseInt(snum[i]);
       }
      int solution = Solution(nums);
    }
}
