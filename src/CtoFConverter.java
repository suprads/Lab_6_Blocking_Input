import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args)
    {
        int celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature value in celsius: ");

        if(in.hasNextInt()) {
            celsius = in.nextInt();
            fahrenheit = (celsius * (9 / 5)) + 32;
            System.out.println("Your celsius value in fahrenheit is: " + fahrenheit + " degrees ");
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid temperature value, not: " + trash);
        }
    }
}