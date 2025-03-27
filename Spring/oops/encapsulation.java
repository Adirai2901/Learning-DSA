class human
{
    private int age= 99;
    private String name= "Aditya";

    public String name(){
        return name;
    }
    public int age(){
        return age;
    }

}

public class encapsulation
{
    public static void main(String[] args) {
        human h = new human();

        // h.name = "Aditya";
        // h.age = 99;

        System.out.println(h.name());
        System.out.println(h.age());
    }
}