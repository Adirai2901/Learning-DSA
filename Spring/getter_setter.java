class human{
    int age;
    String name;

    public String getname(){
        return name;
        
    }
    public int getage(){
        return age;
    }

    public void Setage(int x)
    {
        age = x;
        
    }
    public void Setname(String s)
    {
        name = s;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        human h = new human();
        h.Setage(40);
        h.Setname("Aditya");

        System.out.println(h.getage()+":"+h.getname() );
        
    }
    
}
