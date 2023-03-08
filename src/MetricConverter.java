import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int meters = 0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;
        String trash = "";

        System.out.print("Enter the amount of meters you want to convert: ");
        if(in.hasNextInt()) {
            meters = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid meter value, not: " + trash);
        }

        miles = meters / 1609.344;
        System.out.printf("Miles: %.2f\n", miles);

        feet = meters * 3.28084;
        System.out.println("Feet: " + feet);

        inches = meters * 39.36;
        System.out.println("Inches: " + inches);
    }
}
