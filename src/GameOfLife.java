/**
 * @program: LeetCode
 * @description:
 * @author: LeeXy
 * @create: 2020-04-02 22:46
 **/

public class GameOfLife {
    public static int[][] solution(int[][] board){
        int rows = board.length;
        int cros = board[0].length;
        int[] neighbors = {0, 1, -1};
        for(int x=0;x<rows;x++){
            for(int y=0;y<cros;y++){
                int live = 0;
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        if(!(neighbors[i] == 0 && neighbors[j] == 0)) {//不能将本身算进去
                            int r = x + neighbors[i];
                            int c = y + neighbors[j];
                            if ((r < rows && r >= 0) && (c < cros && c >= 0) && (board[r][c] == 1)) {
                                live += 1;
                            }
                        }
                    }
                }
                System.out.println(x+"  "+y+"  "+live);
                if ((board[x][y] == 1) && (live < 2 || live > 3)) {
                    board[x][y] = 0;
                }
                // 规则 4
                if (board[x][y] == 0 && live == 3) {
                    board[x][y] = 1;
                }
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cros; col++) {
                if (board[row][col] > 0) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return board;
    }

    public static void main(String[] args) {
        int [][]boad = new int[][]{{0,1,0},
                                   {0,0,1},
                                   {1,1,1},
                                   {0,0,0}};
        final int[][] solution = solution(boad);
        for(int i=0;i<solution.length;i++){
            for(int j=0;j<solution[0].length;j++){
                System.out.println(solution[i][j]);
            }
        }

    }
}
