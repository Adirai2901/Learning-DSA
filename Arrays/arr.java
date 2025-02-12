import java.util.*;
public class arr {
    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i = 0 ; i<5;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<5;i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
