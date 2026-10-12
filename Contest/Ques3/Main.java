import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int index = 0;index<n;index++){
            int value = sc.nextInt();
            long ans = 0;
            int[] nums = new int[value];
            for(int i = 0;i<value;i++ ){
                nums[i]  = sc.nextInt();
            }
            int start = 0;
            HashSet<Integer> set = new HashSet<>();
            while(start + 4 < nums.length){   
                if(set.contains(nums[start] + nums[start+2] - nums[start+4])){
                    ans++;
                }else{
                    set.add(nums[start] + nums[start+2] - nums[start+4]);
                }
                start++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
    
}
