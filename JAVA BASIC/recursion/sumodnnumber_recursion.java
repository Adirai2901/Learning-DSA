import java.util.*;;
public class sumodnnumber_recursion {

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int x = sum(n-1);
        int ans = n + x;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last digit");
        int n = sc.nextInt();

        System.out.println(sum(n));

        
        sc.close();
    }
}
