import java.util.*;

public class sumof_n_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Last number");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of Natural numbers till " + n + " is: " + sum);

        sc.close();
    }
}
