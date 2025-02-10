import java.util.*;
public class oddeve {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("The given number is Even");
        }else{
            System.out.println("The given number is Odd");
        }
        
        
        sc.close();
    }
}
