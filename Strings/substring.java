import java.util.*;
public class substring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the staring Index");
        int s = sc.nextInt();
        System.out.println("Enter the Ending Index");
        int e = sc.nextInt();

        String substr = "";

        for(int i = s; i < e;i++){
            substr += str.charAt(i);
        }

        System.out.println(str.charAt(5));

        
        sc.close();
    }
}
