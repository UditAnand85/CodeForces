import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int index = 0;index<n;index++){
            int a = sc.nextInt();
            int k = a;
            int[] nums = new int[a+1];
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == '1'){
                    st.push(i+1);
                }else if(s.charAt(i) == '2'){
                    if(st.isEmpty()){
                        nums[i+1] = 1;
                        continue;
                    }
                    int num = st.pop();
                    nums[num] = 1;
                }else{
                    nums[i+1] = 1;
                }
            }
            int ans = 0;
            for(int i = 1;i<nums.length;i++){
                if(nums[i] == 0){
                    ans++;
                }
            }
            System.out.println(ans);
            if(ans == 0){
                System.out.print(" ");
        
            }else{
                for(int i= 1;i<nums.length;i++){
                    if(nums[i] == 0){
                        System.out.print(i + " ");
                    }
                }
            }
            
            System.out.println("");
        }
        sc.close();
    }
}
