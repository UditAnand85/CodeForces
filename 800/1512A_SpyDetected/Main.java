import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 0;i<n;i++){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int j= 0;j<len;j++){
                arr[j] = sc.nextInt();    
            }
            if(arr[0] == arr[len-1] && arr[0] != arr[1]){
                System.out.println(2);
            }else if(arr[0] != arr[len-1] && arr[0] == arr[1]){
                System.out.println(len);
            }else if(arr[0] != arr[len-1] && arr[len-1] == arr[1]){
                System.out.println(1);
            }else{
                for(int j = 0;j<len;j++){
                    if(arr[j] != arr[0]){
                        System.out.println(j+1);
                    }
                }
            }

        }
        sc.close();
    }
}
