/**
 * @program: LeetCode
 * @description:
 * @author: LeeXy
 * @create: 2020-04-04 22:36
 **/

public class Height {
    public static int solution(int[] height){
        int num = 0;

        for(int index=1;index<height.length;index++){
            int leftH = 0;
            int rightH = 0;
                for (int left = index - 1; left >= 0; left--) {
                  if(height[left]>height[index]&&height[left]>leftH){
                      leftH = height[left];
                  }
                }
            for (int right = index + 1; right < height.length; right++) {
                if(height[right]>height[index]&&height[right]>rightH){
                    rightH = height[right];
                }
            }
            if(leftH>0&&rightH>0){
                if (leftH > rightH) {
                    num = num+rightH - height[index];
                }
                else {
                    num = num+leftH - height[index];
                }
            }
            }

        return num;
    }

    public static void main(String[] args) {
         int hight[] = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        final int solution = solution(hight);
        System.out.println(solution);
    }
}
