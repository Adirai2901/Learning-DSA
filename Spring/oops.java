class calc{
    
    public int add(int n1 , int n2){
        int sum = n1+n2;
        return sum;
    }
}

public class oops{
public static void main(String[] args) {
        int a=5, b=5;
        
        calc cl = new calc();
        System.out.println(cl.add(a, b));
    }
}