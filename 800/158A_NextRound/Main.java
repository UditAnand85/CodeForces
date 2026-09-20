import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int value = arr[k-1];
        int ans = 0;
        for(int i : arr){
            if(i >= arr[k-1] && i > 0){
                ans++;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}