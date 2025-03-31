import java.util.*;
public class all_prime_range {

    public static boolean isprime(int n){
        for(int i = 2;i<=n-1;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void prime(int n){
        for(int i = 2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        prime(x);
        
        
        sc.close();
    }
}
