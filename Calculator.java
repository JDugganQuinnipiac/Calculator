import java.util.Scanner;
public class Calculator{

    public static void main(String[] args) {
        System.out.println("Please enter 2 whole numbers");

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        reader.close();

        System.out.println("The sum of your numbers is: " + (x + y));
    }
}