import java.util.Scanner;

public class Tempconvert
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Celsius calue: ");

        double Celsius = scanner.nextDouble();
        double Fahrenheit = (Celsius * 9)/5 + 32;
        
        System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");

        scanner.close();
    }
}