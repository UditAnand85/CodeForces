import java.util.*;


public class ThreePiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int rounds = sc.nextInt();

        for(int i = 0;i<rounds;i++){
            int alice = sc.nextInt();
            int Bob = sc.nextInt();
            int third = sc.nextInt();
            System.out.println(Math.max(Math.abs( alice + third - Bob),Math.abs(alice - Bob)));
        }
        sc.close();
    }
}
