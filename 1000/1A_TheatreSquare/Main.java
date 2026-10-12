import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int row = 0;
        int col = 0;
        if(m%a == 0){
            row = (m / a);
        }else{
            row = (m/a)+1;
        }
        if(n%a == 0){
            col = (n/a);
        }else{
            col = (n/a)+1;
        }
        if(row == 1){
            System.out.println(col);
        }else if(col == 1){
            System.out.println(row);
        }else{
            System.out.println((long)row*col);
        }

        sc.close();

    }
}