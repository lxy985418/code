import java.util.*;

/**
 * @program: LeetCode
 * @description:地图分析
 * @author: LeeXy
 * @create: 2020-03-29 21:36
 **/

public class MaxDistance {
    public static int solution(int[][] grid){
//        int m = grid.length;
//        int n = grid[0].length;
//        int maxDistance =0;
//        //最小陆地距离
//        List<Integer> lands = new ArrayList<>();
//        Queue<Integer> oceans = new LinkedList<>();
//        for(int i = 0;i<m;i++){
//            for(int j = 0;j<n;j++){
//                if(grid[i][j]==0){
//                    oceans.offer(i*m+j);
//                }
//                if (grid[i][j]==1){
//                    lands.add(i*m+j);
//                }
//            }
//        }
//        int []min = new int[oceans.size()];
//        if(lands.size()==0||oceans.size()==0) {
//            return -1;
//        }
//       for(int i =0;oceans.size()>0;i++){
//
//            int ocean = oceans.poll();
//            int x = ocean/n;
//            int y = ocean%n;
//            int minD = Integer.MAX_VALUE;
//
//            for(int index = 0;index<lands.size();index++){
//                int x1 = lands.get(index)/n;
//                int y1 = lands.get(index)%n;
//
//                int xDistance = x - x1;
//
//                int yDistance = y - y1;
//
//                if(xDistance<0){
//                    xDistance=xDistance*(-1);
//                }
//                if(yDistance<0){
//                    yDistance=yDistance*(-1);
//                }
//                if(minD>xDistance+yDistance){
//                    minD = xDistance+yDistance;
//                    System.out.println("x:"+x+"   y:"+y+"    最小值："+minD);
//                }
//            }
//           if(maxDistance<minD){
//               maxDistance = minD;
//           }
//        }
//
//
//
//  return maxDistance;  暴力破解不得行 会超时

        return 0;
    }

    public static void main(String[] args) {
        int [][]grid = new int [][]{
                {1,0,0},{0,0,0  },{0,0,0}};
        final int solution = solution(grid);
        System.out.println(solution);
    }
}
