import java.util.*;

public class product_of_a_b {
    public static int mult(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The Product of " + x + " * " + y + " = " + mult(x, y));

        sc.close();
    }
}
