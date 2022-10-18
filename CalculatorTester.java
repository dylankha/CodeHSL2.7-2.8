import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.println ("Enter two doubles");
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.println (x + " + " + y + " = " + calc.sum(x,y));
        System.out.println (x + " - " + y + " = " + calc.subtract(x,y));
        System.out.println (x + " * " + y + " = " + calc.multiply(x,y));
        System.out.println (x + " / " + y + " = " + calc.divide(x,y));
    }
}
