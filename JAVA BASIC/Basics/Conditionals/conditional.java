import java.util.*;

public class conditional {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        }else{
            System.out.println("Oppos You cannot vote!");
        }
        sc.close();
    }
}
