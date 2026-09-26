import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int row = 0;
        int column = 0;
        for(int i = 1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int value = sc.nextInt();
                if(value == 1){
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(Math.abs(row-3) + Math.abs(column-3));
        sc.close();
    }
}