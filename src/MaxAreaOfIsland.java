import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description:给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。
 *
 * @author: LeeXy
 * @create: 2020-03-15 22:58
 **/

public class MaxAreaOfIsland {
    public static int Solution(int [][]grid){
        int row = grid.length;
        //列的长度
        int column = grid[0].length;
        //行的长度
        Queue<Integer> islandSite = new LinkedList<>();

        //记录岛屿周围位置
        int maxRear = 0;
        for(int i = 0; i<row;i++){
            for(int j = 0; j<column;j++){
               if(grid[i][j]==1){
                   grid[i][j]=2;
                   islandSite.offer(i*column+j);
                   int rear = 1;
                   while (!islandSite.isEmpty()){
                       int p = islandSite.poll();
                       int x = p/column;
                       int y = p%column;
                       if(x-1>=0&&grid[x-1][y]==1){
                           rear++;
                           grid[x-1][y]=2;
                           islandSite.offer((x-1)*column+y);
                       }
                       if(x+1<row&&grid[x+1][y]==1){
                           rear++;
                           grid[x+1][y]=2;
                           islandSite.offer((x+1)*column+y);
                       }
                       if(y-1>=0&&grid[x][y-1]==1){
                           rear++;
                           grid[x][y-1]=2;
                           islandSite.offer((x*column+(y-1)));
                       }
                       if (y + 1 < column && grid[x][y + 1] == 1) {
                           rear++;
                           grid[x][y + 1] = 2;
                           islandSite.offer(x * column + y + 1);
                       }
                       if(rear>maxRear){
                           maxRear=rear;
                       }
                   }
               }
            }
        }
        return maxRear;
    }

    public static void main(String[] args) {
        int [][]grid = {{0,0,0,0,0,0,0,0}};
         int solution = Solution(grid);
        System.out.println(solution);

    }

}
