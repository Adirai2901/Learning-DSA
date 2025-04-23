import java.util.*;

public class whileloops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of times:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i + ": Hello world");
            i++;
        }

        sc.close();
    }

}

// while (Condition) {
// Statement
// }
