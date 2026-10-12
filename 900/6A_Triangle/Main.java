import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ans = "IMPOSSIBLE";
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a+b == c || a+c == b||b+c == a){
            ans = "SEGMENT";
        }
        if(a+d == c || a+c == d||d+c == a){
            ans = "SEGMENT";
        }
        if(a+b == d || a+d == b||b+d == a){
            ans = "SEGMENT";
        }
        if(d+b == c || d+c == b||b+c == d){
            ans = "SEGMENT";
        }
        if(a + b > c && a + c > b && b + c > a){
            ans = "TRIANGLE";
        }
        if(a + d > c && a + c > d && d + c > a){
            ans = "TRIANGLE";
        }
        if(d + b > c && d + c > b && b + c > d){
            ans = "TRIANGLE";
        }
        if(a + b > d && a + d > b && b + d > a){
            ans = "TRIANGLE";
        }
        
        System.out.print(ans);

        sc.close();
    }
}