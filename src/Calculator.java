import java.util.Scanner;

public class Calculator
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Num: ");
        int num1 = s.nextInt();
        System.out.println("Enter Second Num: ");
        int num2 = s.nextInt();

        System.out.println("Enter Symbol: ");
        String sym = s.next();
        int result;

        switch(sym)
        {
            case "+":result = num1 + num2;
                        System.out.println("Addition is: "+result);
                        break;
            case "-":result = num1 - num2;
                        System.out.println("Subtraction is: "+result);
                        break;
            default: System.out.println("Invalid Symbol!");
        }
    }
}
