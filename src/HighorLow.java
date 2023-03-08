import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int userInput = 0;
        int rndVal = rnd.nextInt(10) + 1;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter a number between 1 and 10: ");

            if(in.hasNextInt()) {
                userInput = in.nextInt();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nEnter a valid input, not : " + trash);
            }
        }while(!done);

        if(userInput > rndVal){
            System.out.println("Your guess was too high!");
        }
        else if(userInput < rndVal){
            System.out.println("Your guess was too low!");
        }
        else {
            System.out.println("Your guess was right on the money!");
        }
    }
}
