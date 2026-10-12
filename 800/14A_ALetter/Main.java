import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] arr = new char[m][n];
        int maxleft = Integer.MAX_VALUE;
        int maxright = Integer.MIN_VALUE;
        int maxtop = Integer.MAX_VALUE;
        int maxbottom = Integer.MIN_VALUE;
        for(int i = 0;i<m;i++){
            String value = sc.next();
            for(int j = 0;j<n;j++){
                arr[i][j] = value.charAt(j);
                if(arr[i][j] == '*'){
                    maxleft = Math.min(maxleft,j);
                    maxright = Math.max(maxright,j);
                    maxtop = Math.min(maxtop,i);
                    maxbottom = Math.max(maxbottom,i);
                }
            }

        }
        for(int i = maxtop;i<=maxbottom;i++){
            for(int j = maxleft;j<=maxright;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }






        sc.close();
    }
}