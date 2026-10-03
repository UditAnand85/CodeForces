import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char curr = s.charAt(0);
        int count = 0;
        for(int i = 1;i<n;i++){
            if(s.charAt(i) == curr){
                count++;
            }else{
                curr = s.charAt(i);
            }
        }
        System.out.println(count);
        sc.close();
    }
}