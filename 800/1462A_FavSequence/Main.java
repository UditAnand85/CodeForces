import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int index = 0;index<n;index++){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int i = 0;i<len;i++){
                arr[i] = sc.nextInt();
            }
            int left = 0;
            int right = len-1;
            while(left<right){
                System.out.print(arr[left] + " ");
                System.out.print(arr[right] + " ");
                left++;
                right--;
            }if(left == right){
                System.out.print(arr[left] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
