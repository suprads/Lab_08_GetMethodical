import java.util.Scanner;
public class FavNumbers
{
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println("Your favorite integer is: " + num1);

        double num2 = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("Your favorite double is: " + num2);

    }
}
