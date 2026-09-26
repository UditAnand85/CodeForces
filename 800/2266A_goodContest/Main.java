import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0;i<testcases;i++){
            int ans = 0;
            int participants = sc.nextInt();
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();
            ans = Math.max(ans,participants - first);
            ans = Math.max(ans,participants - second);
            ans = Math.max(ans,participants - third);
            System.out.println(ans);
        }
        sc.close();
    }
}