import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        String str = sc.nextLine();
        int k = str.length();
        for(int i = 0 ; i < k/2;i++){
            if (str.charAt(i)== str.charAt(k-i-1)){
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        
        
        
        
        
        
        sc.close();
        
    }
}
