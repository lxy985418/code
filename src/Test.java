import java.util.Scanner;

/**
 * @program: LeetCode
 * @description:
 * @author: LeeXy
 * @create: 2020-03-15 09:49
 **/

public class Test {
    public static int Solution(int num){
        int account  = 0;
        int weishu = 0;
        int leftWeishu = 0;
       for(int i =1;i<num+1;i++){
//个位 = num%10;
          int temp = i;


          if(i<10){
              account++;
          }
           while(temp>10){
               weishu = temp%10;
               leftWeishu = temp/10%10;
               //左边一位的位数
               if(weishu>=leftWeishu) {
                   temp = temp / 10;
                   if (temp < 10) {
                       System.out.println(i);
                       account++;
                   }
               }
               else {
                   break;
               }

           }
       }
       return account;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int solution = Solution(num);
        System.out.println(solution);
    }
}
