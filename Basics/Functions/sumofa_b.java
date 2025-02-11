import java.util.*;

public class sumofa_b {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The sum of " + x + " + " + y + " = " + sum(x, y));

        sc.close();
    }
}
