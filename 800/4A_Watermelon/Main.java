import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        if(weight == 2){
            System.out.println("NO");
        }
        else if(weight % 2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        sc.close();
    }
}