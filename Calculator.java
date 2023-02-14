import java.util.Scanner;
public class Calculator{

    public static void main(String[] args) {
        System.out.println("Please enter 2 whole numbers");

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();

        System.out.println("Would you like to add, subrtract, multiply, or divide these numbers? (Type '1' for Addition, '2' for Subtraction, '3' for Multiplication, or '4' for Division)");
        int operation = reader.nextInt();
        reader.close();

        if(operation == 1){
            System.out.println("The sum of your numbers is " + (x + y));
        }else if(operation == 2){
            System.out.println("The difference of your numbers is " + (x - y));
        }else if(operation == 3){
            System.out.println("The product of your numbers is " + (x * y));
        }else if(operation == 4){
            double quotient = (double)x/y;
            System.out.println("The quotient of your numbers is " + quotient);
        }else{
            System.out.println("Sorry, invalid reponse. Please Try again.");
        }
    }
}