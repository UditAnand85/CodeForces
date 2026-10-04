import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i  =0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            String st = sc.next();
            sb.append(st.charAt(0));
            for(int j = 1;j<st.length()-1;j = j + 2){
                sb.append(st.charAt(j));
            }
            sb.append(st.charAt(st.length()-1));
            System.out.println(sb.toString());
        }

        sc.close();
    }
}
