import java.util.*;

public class switchh{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second number:");
        int b = sc.nextInt();
        System.out.println("Enter the operation\n1.Add\n2.Sub\n3.Mult\n4.Div");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
            default:
                System.out.println("Enter a Valid operation");
                break;
        }
        
        
        
        
        sc.close();
    }
}
