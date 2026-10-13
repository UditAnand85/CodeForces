import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] =  sc.nextInt();
        }
        for(int i= 1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                int diff = nums[i-1] - nums[i];
                ans += Math.ceilDiv(diff,d);
                nums[i]  = nums[i] +  Math.ceilDiv(diff,d) * d;              
            }if(nums[i] == nums[i-1]){
                ans++;
                nums[i] += d;
            }
        }
        System.out.println(ans);


        sc.close();
    }
}
