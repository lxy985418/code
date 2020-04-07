/**
 * @program: LeetCode
 * @description:车的可用捕获量
 * @author: LeeXy
 * @create: 2020-03-26 21:28
 **/

public class NumRookCaptures {
    public static int solution(char[][] board) {
        int x = 0 ;
        int y = 0 ;
        int num = 0;
       bgm: for (int x1 = 0; x1 < board.length; x1++) {
            for (int y1 = 0; y1 < board[0].length; y1++) {
                if (board[x1][y1] == 'R') {
                    x=x1;
                    y=y1;
                    break bgm;
                }
            }
        }
        for (int indexXR = x; indexXR >= 0; indexXR--) {
            //左边
            if (board[indexXR][y] == 'p') {
                //遇到卒就吃
                num += 1;
                break;
            }
            if (board[indexXR][y] == 'B') {
                //遇到象就溜
                break;
            }
        }
        for (int indexXA = x; indexXA < board.length; indexXA++) {
            //右边
            if (board[indexXA][y] == 'p') {
                //遇到卒就吃
                num += 1;
                break;
            }
            if (board[indexXA][y] == 'B') {
                //遇到象就溜
                break;
            }
        }
        for (int indexYR = x; indexYR >= 0; indexYR--) {
            //下边
            if (board[x][indexYR] == 'p') {
                //遇到卒就吃
                num += 1;
                break;
            }
            if (board[x][indexYR] == 'B') {
                //遇到象就溜
                break;
            }
        }
        for (int indexYA = x; indexYA < board[0].length; indexYA++) {
            //左边
            if (board[x][indexYA] == 'p') {
                //遇到卒就吃
                num += 1;
                break;
            }
            if (board[x][indexYA] == 'B') {
                //遇到象就溜
                break;
            }

        }
        return num;
    }

    public static void main(String[] args) {
        char[][] board = new char[8][8];
        board = new char[][]{
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', 'R', '.', '.', '.', 'p'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}
        };


        final int solution = solution(board);
        System.out.println(solution);
    }
}