import java.util.*;
public class fact_recursion {


    public static int fectt(int n){
        if(n == 0){
            return 1;
        }
        int n_1 = fectt(n-1);
        int ans = n*n_1;
        return ans;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println(fectt(x));
        
        sc.close();
        
    }
}
