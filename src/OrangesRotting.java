import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @program: LeetCode
 * @description:
 * @author: LeeXy
 * @create: 2020-03-04 02:00
 **/

public class OrangesRotting {
     static int orangesRotting(int[][] grid) {
         Queue<Integer> badOrg = new LinkedList<>();
        int orangeNum=0;
        int time=0;
        int m =grid.length;
        int n =grid[0].length;
        //判断是否有烂橘子
        for(int i = 0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                   int k=i * n + j;
                    badOrg.offer(i * n + j);
                    //将坏橘子的下标记录
                    }
                    if(grid[i][j]==1){
                        orangeNum+=1;
                    }
                }
            }
            while (!badOrg.isEmpty()&&orangeNum>0){
                time++;
               int size = badOrg.size();
         for(int index = 0;index <size;index++){
             int p = badOrg.poll();
             int x = p/n; int y = p%n;

             if(x-1>=0&&grid[x-1][y]==1){
                 orangeNum-=1;
                 grid[x-1][y]=2;
                 badOrg.offer((x-1)*n+y);
             }
             if(x+1<m&&grid[x+1][y]==1){
                 orangeNum-=1;
                 grid[x+1][y]=2;
                 badOrg.offer((x+1)*n+y);
             }
             if(y-1>=0&&grid[x][y-1]==1){
                 orangeNum-=1;
                 grid[x][y-1]=2;
                 badOrg.offer((x*n+(y-1)));
             }
             if (y + 1 < n && grid[x][y + 1] == 1) {
                 orangeNum--;
                 grid[x][y + 1] = 2;
                 badOrg.offer(x * n + y + 1);
             }

         }
     }

            return orangeNum==0?time:-1;
        }



    public static void main(String[] args) {
    int [][]grid = {{2,1,1},{1,1,0},{0,1,2}};
        //int i = orangesRotting(grid);
        int j = orangesRotting(grid);
        System.out.println(j);
    }


}
