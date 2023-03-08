import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args) {
        int width = 0;
        int height = 0;
        int area = 0;
        int perimeter = 0;
        double diagonal = 0.0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        if (in.hasNextInt()) {
            width = in.nextInt();
        }
        else {
            trash = in.nextLine();
            System.out.println("You must enter a valid width, not: " + trash);
        }
        System.out.print("Enter the height of the rectangle: ");
        if (in.hasNextInt()) {
            height = in.nextInt();
        }
        else {
            trash = in.nextLine();
            System.out.println("You must enter a valid height, not: " + trash);
        }

        area = width * height;
        System.out.println("The area of the rectangle is: " + area);

        perimeter = (2 * width) + (2 * height);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("The diagonal of the rectangle is: " + diagonal);
    }
}
