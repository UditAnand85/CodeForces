import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(0);
        }
        else{
            int ans = 0;
            if(n > 5){
                ans = ans + (n / 5);
            }

            if(ans * 5 == n){
                System.out.println(ans);
            }else{
                System.out.println(ans+1);
            }
        }
        

        sc.close();
    }
}
