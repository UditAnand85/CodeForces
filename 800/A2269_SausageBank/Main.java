import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i = 0;i<cases;i++){

            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println((int)Math.pow(2,(n-k+1)) + (2 * (k-1)));
        }
        sc.close();
    }
}
