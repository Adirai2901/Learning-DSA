public class xpown {
    
    public static int power(int x , int n){
        if(n ==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    
    public static void main(String[] args) {
        int n = 2, pow = 10 ;
        System.out.println(power(n, pow));
    }
}
