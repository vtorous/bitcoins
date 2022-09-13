import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        float bitcoinsPrice;    // Current bitcoin price
        float usdAmount;        // Amount of dollars
        float btcAmount;        // Amount of bitcoins

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("What is Bitcoin price today?");
            bitcoinsPrice = in.nextFloat();

            System.out.println("How much $ do you have?");
            usdAmount = in.nextFloat();

            // Price and amount of money must be positive numbers
            if (bitcoinsPrice > 0 & usdAmount > 0) {
                btcAmount = usdAmount / bitcoinsPrice;
                System.out.println("You can buy " + btcAmount + " BTC");
            } else {
                System.out.println("The price or amount cannot be negative!");
            }

        } catch (InputMismatchException e) {
            System.err.println("Please enter a number!");
        }
    }
}