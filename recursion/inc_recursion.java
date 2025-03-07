import java.util.*;


public class inc_recursion {

    public static void revpr(int n){
        if(n ==1 ){
            System.out.println(n);
            return;
        }
        revpr(n-1);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        revpr(n);
        sc.close();
        
    }
}
