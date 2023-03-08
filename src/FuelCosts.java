import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0.0;
        double fuelEfficiency = 0.0;
        double gasPrice = 0.0;
        double tripPrice = 0.0;
        double currentGasRange = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the number of gallons of gas in your tank: ");

            if(in.hasNextDouble()) {
                gallons = in.nextDouble();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nEnter a valid input, not : " + trash);
            }
        }while(!done);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if(in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                done = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("\nEnter a valid input, not : " + trash);
            }
        }while(!done);

        do {
            System.out.print("Enter the price of gas per gallon: ");

            if(in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                done = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("\nEnter a valid input, not : " + trash);
            }
        }while(!done);

        tripPrice = gasPrice * (100 / fuelEfficiency);
        System.out.println("The total cost of the trip will be: " + tripPrice);

        currentGasRange = gallons * fuelEfficiency;
        System.out.println("You can go " + currentGasRange + " miles with " + gallons + " gallons of gas in your tank!");
    }
}
