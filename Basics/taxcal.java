import java.util.*;
public class taxcal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Sal:");
        int n = sc.nextInt();
        float tax;
        if(n<=500000){
            System.out.println("Zero Tax");
        }else if(n > 500000 && n<=1000000 ){
            tax = n*0.2f;
            System.out.println("Total tax = "+tax);
        }else{
            tax = n*.30f;
            System.out.println("Total tax = "+tax);
        }
        
        
        
        
        sc.close();
    }
}
