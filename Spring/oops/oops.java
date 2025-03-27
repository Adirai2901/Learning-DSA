// class calc{
    
//     public int add(int n1 , int n2){
//         int sum = n1+n2;
//         return sum;
//     }
// }

// public class oops{
// public static void main(String[] args) {
//         int a=5, b=5;
        
//         calc cl = new calc();
//         System.out.println(cl.add(a, b));
//     }
// }

// class penn
// {
//     public String getmeapen(int x)
//     {
//         if(x>=10){
//             return "Pen";
//         }
//         else{
//             return "Amount less";
//         }
//     }
// }

// public class oops {

//     public static void main(String[] args) {
//         penn pn = new penn();
        
//         System.out.println(pn.getmeapen(2));
//     }
// }

class calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2,int n3)
    {
        return n1+n2+n3;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}

public class oops
{
    public static void main(String[] args) {
        int n1 = 5,n2=10;
        calc cl = new calc();
        System.out.println("Addition"+ " "+cl.add(n1, n2));
        System.out.println("Subraction"+ " " +cl.sub(n1, n2));
    }
}
