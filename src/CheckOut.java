import java.util.Scanner;

public class CheckOut
{
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
        System.out.println("Your item costs: $" + price);

            boolean itemYN = SafeInput.getYNConfirm(in,"Do you have another item?");
            if (itemYN) {
                double price2 = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
                System.out.println("Your item costs: $" + price2);
                double total = price + price2;
                System.out.printf("Your total is: $%.2f", total);
            }
            else {
                double total = price;
                System.out.printf("Your total is: $%.2f", total);

            }
    }
}
