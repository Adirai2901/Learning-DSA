import java.util.*;
public class factorial {
    public static int fact(int n){
        int fact = 1;
        for(int i = n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("The Factorial of "+x+" = "+fact(x));
        
        sc.close();
    }
}
