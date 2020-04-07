/**
 * @program: LeetCode
 * @description:有效括号的嵌套深度
 * @author: LeeXy
 * @create: 2020-04-01 19:30
 **/

public class MaxDepthAfterSplit {
    public static int[] solution(String seq){
        char[] chars =new char[ seq.length()];
        int a,b;
        a=b=0;
        int num[] = new int[seq.length()];
        if(seq.length()==0){
            num[0]=0;
            return num ;
        }
        seq.getChars(0,seq.length(),chars,0);
        for(int index = 0 ;index<chars.length;index++){
          if(chars[index]=='('){
              if(a<=b){
                  a++;
                  num[index]=0;
              }
              else{
                  b++;
                  num[index]=1;
              }

          }
          else{
              if(a>b)
              {
                  a--;
                  num[index]=0;
              }else{
                  b--;
                  num[index]=1;
              }

          }

        }
        return num;
    }

    public static void main(String[] args) {
        String seq =  "(((()))((())))";
        final int[] solution = solution(seq);
        for(int i =0;i<solution.length;i++) {
            System.out.println(solution[i]);
        }
    }
}
