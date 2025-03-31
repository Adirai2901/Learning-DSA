import java.util.*;
public class ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        String s = ((a%2)==0)? "even":"odd";
        System.out.println(s);






        sc.close();
    }
}
