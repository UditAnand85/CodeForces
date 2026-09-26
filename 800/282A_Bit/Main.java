import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0;i<n;i++){
            String st = sc.next();
            if(st.charAt(st.length()-1) == '+' || st.charAt(0) == '+'){
                ans++;
            }
            if(st.charAt(st.length()-1) == '-' || st.charAt(0) == '-'){
                ans--;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}