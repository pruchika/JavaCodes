//Swap 2 numbers without using 3rd variable

public class Swap2_2
{
    public static void main(String []args)
    {
        int a = 10, b = 20;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
