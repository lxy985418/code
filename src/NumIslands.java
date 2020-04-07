import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description:
 * @author: LeeXy
 * @create: 2020-03-16 00:08
 **/

public class NumIslands {
    public static int Solution(char [][]grid){
        if (grid.length==0){
            return 0;
        }
        int row = grid.length;
        //列的长度
        int column = grid[0].length;
        //行的长度
        Queue<Integer> islandSite = new LinkedList<>();
        //记录岛屿周围位置
        int maxNum = 0;
        for(int i = 0; i<row;i++){
            for(int j = 0; j<column;j++){
                if(grid[i][j]=='1'){
                    grid[i][j]='2';
                    islandSite.offer(i*column+j);
                    int rear = 1;
                    while (!islandSite.isEmpty()){
                        int p = islandSite.poll();
                        int x = p/column;
                        int y = p%column;
                        if(x-1>=0&&grid[x-1][y]=='1'){
                            rear++;
                            grid[x-1][y]='2';
                            islandSite.offer((x-1)*column+y);
                        }
                        if(x+1<row&&grid[x+1][y]=='1'){
                            rear++;
                            grid[x+1][y]='2';
                            islandSite.offer((x+1)*column+y);
                        }
                        if(y-1>=0&&grid[x][y-1]=='1'){
                            rear++;
                            grid[x][y-1]='2';
                            islandSite.offer((x*column+(y-1)));
                        }
                        if (y + 1 < column && grid[x][y + 1]=='1') {
                            rear++;
                            grid[x][y + 1] = '2';
                            islandSite.offer(x * column + y + 1);
                        }

                    }
                    maxNum++;
                }
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        char [][]grid = {};


        int solution = Solution(grid);
        System.out.println(solution);

    }
}
