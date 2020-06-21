import java.util.Scanner;

public class MathsTable
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int t = s.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(t+ " * " +i + " = " +(t*i));
        }
    }
}
