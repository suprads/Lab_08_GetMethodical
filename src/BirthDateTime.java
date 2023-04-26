import java.util.Scanner;

public class BirthDateTime
{

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int year = SafeInput.getRangedInt(in,"What year were you born?",1950,2015);

        int month = SafeInput.getRangedInt(in,"What month were you born?",1,12);

        switch (month) {
            case 2:
                int day1 = SafeInput.getRangedInt(in, "What day were you born?", 1, 29);
                System.out.println("You were born on " + month + "/" + day1 + "/" + year);
                break;

            case 1,3,5,7,8,10,12:
                int day2 = SafeInput.getRangedInt(in, "What day were you born?", 1, 31);
                System.out.println("You were born on " + month + "/" + day2 + "/" + year);
                break;

            case 4,6,9,11:
                int day3 = SafeInput.getRangedInt(in, "What day were you born?", 1, 30);
                System.out.println("You were born on " + month + "/" + day3 + "/" + year);
                break;

        }

        int hour = SafeInput.getRangedInt(in,"What hour were you born?",1,24);

        int minute = SafeInput.getRangedInt(in,"What minute were you born?",1,59);

        System.out.println("You were born at " + hour + ":" + minute);

    }
}
