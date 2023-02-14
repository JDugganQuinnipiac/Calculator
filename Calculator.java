import java.util.Scanner;
public class Calculator{

    public static void main(String[] args) {
        System.out.println("Please enter 2 whole numbers");

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();

        System.out.println("Would you like to add or subrtract these numbers? (Type '1' for Addition or '2' for Subtraction)");
        int AddOrSub = reader.nextInt();
        reader.close();

        if(AddOrSub == 1){
            System.out.println("The sum of your numbers is " + (x + y));
        }else if(AddOrSub == 2){
            System.out.println("The difference of your numbers is " + (x - y));
        }else{
            System.out.println("Sorry, invalid reponse. Please Try again.");
        }
    }
}