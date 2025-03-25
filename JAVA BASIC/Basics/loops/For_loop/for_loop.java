import java.util.*;

public class for_loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World!");
        }

        sc.close();
    }
}
/* 
 * for(initial;condition;update){
 *     do something
 * }
*/