/**
 * @program: LeetCode
 * @description:
 * @author: LeeXy
 * @create: 2020-03-15 12:16
 **/
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String[] place = new String[n+1];
        for(int i = 0; i< n; i++) {
            place[i] = scan.next();    //输入地图
        }
        int month = scan.nextInt();        //输入月份

        char[][] p = new char[n][m];    //地图转为二维数组p[n][m];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j< m; j++) {
                p[i][j] = place[i].charAt(j);
            }
        }
        char[][] p2 = new char[n][m];    //暂存地p2
        for(int t = 0; t< month; t++) {

            for(int i = 0; i<n; i++) {
                for(int j = 0; j< m; j++) {
                    if(p[i][j] == 'g') {
                        p2[i][j] = 'g';
                        if(i-1>=0) p2[i-1][j] = 'g';
                        if(i+1<n) p2[i+1][j] = 'g';
                        if(j-1>=0) p2[i][j-1] = 'g';
                        if(j+1<m) p2[i][j+1] = 'g';
                    }
                }
            }
            for(int i = 0; i<n; i++) {
                for(int j = 0; j< m; j++) {
                    p[i][j]=p2[i][j];
                }
            }
        }
        for(int i = 0; i<n; i++) {
            for(int j = 0; j< m; j++) {
                if(p[i][j] == 'g')System.out.print(p[i][j]);
                else System.out.print(".");
            }
            System.out.println();
        }
        scan.close();
    }
}