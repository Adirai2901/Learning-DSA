import java.util.*;

public class bin_to_dec {
    public static void convert(int n) {
        int dec = 0;
        int p = 0;

        while (n > 0) {
            dec = dec + n % 10 * (int) Math.pow(2, p);
            p++;
            n /= 10;
        }
        System.out.println(dec);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int x = sc.nextInt();
        convert(x);        
        sc.close();
    }
}
