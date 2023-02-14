import java.util.Scanner;
public class Calculator{

    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers (Decimals allowed)");

        Scanner reader = new Scanner(System.in);
        float x = reader.nextFloat();
        float y = reader.nextFloat();

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
            if(y == 0){
                System.out.println("Error: Divide by Zero");
            }else{
                System.out.println("The quotient of your numbers is " + (x / y));
            }
        }else{
            System.out.println("Sorry, invalid reponse. Please Try again.");
        }
    }
}