import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int index = 0;index<n;index++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();
            int ansx = 0;
            int ansy = 0;
            boolean ansgot = false;
            for(int i = 25;i>=-25;i--){
                for(int j = 25;j>=-25;j--){
                    int equ = ((x-i)*(x-i) + (y-j)*(y-j));
                    if(equ == r*r){
                        ansx = i;
                        ansy = j;
                        ansgot = true;
                        break;
                    }

                }
                if(ansgot == true){
                    break;
                }

            }
            System.out.print(ansx+ " ");
            System.out.println(ansy);
        }




        sc.close();
    }
}