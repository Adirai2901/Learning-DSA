import java.util.*;
public class maxnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("The Max no is: "+a);
        }else{
            System.out.println("The Max no is: "+b);
        }
        sc.close();
    }
}
