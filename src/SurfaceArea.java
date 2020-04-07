/**
 * @program: LeetCode
 * @description:三维形体的表面积
 * @author: LeeXy
 * @create: 2020-03-26 22:27
 **/

public class SurfaceArea {
    public static int solution(int[][] grid){
        int area = 0 ;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j< grid[0].length;j++){
                if (grid[i][j] != 0) {
                    int tenmArea = 4 * grid[i][j] + 2;
                    //临时面积为：4*n+2
                    if (i - 1 >= 0) {
                        //减去左边的挡住的表面积
                        if (grid[i][j] >= grid[i - 1][j]) {
                            tenmArea = tenmArea - grid[i - 1][j];
                        } else {
                            tenmArea = tenmArea - grid[i][j];
                        }
                    }
                    if (i + 1 < grid.length) {
                        //减去右边挡住的表面积
                        if (grid[i][j] >= grid[i + 1][j]) {
                            tenmArea = tenmArea - grid[i + 1][j];
                        } else {
                            tenmArea = tenmArea - grid[i][j];
                        }
                    }
                    if (j - 1 >= 0) {
                        if (grid[i][j] >= grid[i][j - 1]) {
                            tenmArea = tenmArea - grid[i][j - 1];
                        } else {
                            tenmArea = tenmArea - grid[i][j];
                        }
                    }
                    if (j + 1 < grid[0].length) {
                        if (grid[i][j] >= grid[i][j + 1]) {
                            tenmArea = tenmArea - grid[i][j + 1];
                        } else {
                            tenmArea = tenmArea - grid[i][j];
                        }
                    }
                    area += tenmArea;
                }


            }
        }
        return area;
    }

    public static void main(String[] args) {
       int [][]grid = new int[][]{{0,3,4,3},{4,5,0,5},{0,4,2,4},{4,0,0,2}};
        final int solution = solution(grid);
        System.out.println(solution);
    }
}
