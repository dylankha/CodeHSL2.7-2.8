import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        Fraction frac1 = new Fraction (1,2);
        // Ask for input
        System.out.println ("Enter the numerator:");
        int numer2 = input.nextInt();
        System.out.println ("Enter the denominator:");
        int denom2 = input.nextInt();
        
        // Create a new Fraction with the user's input
        Fraction frac2 = new Fraction (numer2, denom2);
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        int fnumer = frac1.getNumerator()*frac2.getDenominator() + frac1.getDenominator()*frac2.getNumerator();
        int fdenom = frac1.getDenominator() * frac2.getDenominator();
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println (frac1 + " + " + frac2 + " = " + fnumer +"/"+fdenom);
        
    }
}
