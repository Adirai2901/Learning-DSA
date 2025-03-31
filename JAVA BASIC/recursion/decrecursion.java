import java.util.*;


public class decrecursion {

    public static void revpr(int n){
        if(n ==1 ){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        revpr(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        revpr(n);
        sc.close();
        
    }
}
