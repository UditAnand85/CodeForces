import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int[] freq = new int[26];
            int len = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            char curr = s.charAt(0);
            for(int j = 1;j<len;j++){
                if(freq[s.charAt(j) - 'A'] > 0){
                    ans = 1;
                    break;
                }
                if(s.charAt(j) != curr){
                    freq[s.charAt(j-1) - 'A']++;
                    curr = s.charAt(j);
                }
            }
            if(ans == 1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
