import java.util.*;
public class binocoff {

    public static int fact(int n){
        int fact = 1;
        for(int i = n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }

    public static int bicof(int n,int r){
        int fact_n= fact(n);
        int fact_r= fact(r);
        int fact_nr= fact(n-r);

        int bi = fact_n/(fact_r*fact_nr);
        return bi;
    }

    public static void main(String args[]){
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(bicof(x, y));
        sc.close();
    }
}