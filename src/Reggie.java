import java.util.Scanner;

public class Reggie
{
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String SSN = "";
        String SSN_RegEx = "^\\d{3}-\\d{2}-\\d{4}$";
        SSN = SafeInput.getRegExString(in, "Enter your SSN", SSN_RegEx);
        System.out.println("Your SSN is: " + SSN);

        String UCMnum = "";
        String UCMNum_RegEx = "^(M|m)\\d{5}$";
        UCMnum = SafeInput.getRegExString(in, "Enter your UC M number", UCMNum_RegEx);
        System.out.println("Your UC M number is: " + UCMnum);

        String Menu = "";
        String Menu_RegEx = "^[OoSsVvQq]$"; // ###-##_####
        Menu = SafeInput.getRegExString(in, "Enter your menu choice", Menu_RegEx);
        System.out.println("Your menu choice is: " + Menu);


    }
}
