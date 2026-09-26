import java.util.*;

public class Main {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int one = 0;
        int two = 0;
        int three = 0;
        for(char ch : st.toCharArray()){
            if(ch == '1'){
                one++;
            }else if(ch == '2'){
                two++;
            }else if(ch == '3'){
                three++;
            }
        }
        
        for(int i = 0;i<one;i++){
            if(two == 0 && three == 0 && i == one-1){
                sb.append("1");
                break;
            }
            sb.append("1+");
        }
        for(int j = 0;j<two;j++){
            if(three == 0 && j == two-1){
                sb.append("2");
                break;
            }
            sb.append("2+");
        }for(int k = 0;k<three;k++){
            if(k == three - 1 ){
                sb.append("3");
                break;
            }
            sb.append("3+");
        }
        System.out.println(sb.toString());

        sc.close();
    }    
}
