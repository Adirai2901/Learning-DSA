import java.util.*;
public class shortes_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the path:");

        String str = sc.nextLine();
        int x = 0 ,y =0 ;
        for(int i = 0 ; i < str.length();i++){
            if(str.charAt(i) =='N'){
                y++;
            }else if(str.charAt(i) =='S'){
                y--;
            }
            else if(str.charAt(i) =='E'){
                x++;
            }else if(str.charAt(i) =='W'){
                x--;
            }else{
                System.out.println("Enter an Vaild path");
            }
        }
        int X2 = x*x;
        int y2 = y*y;
        float ans = (float)Math.sqrt(X2+y2);
        System.out.println("The shortest path is: "+ans);
    
        
        sc.close();
    }
}
