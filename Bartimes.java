package bartimes;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Bartimes
{
    private static String[] offersArray;

    static {
        offersArray = new String[]{
            "EVERYDAY: $5.00 Jim Bean shots always.",
            "MONDAY: $4 everything",
            "TUESDAY: $3.50 bottles of Blonde and Big Wheel.",
            "WEDNESDAY: $4.50 mixed drinks. $5 pints.",
            "THURSDAY: $2.75 drinks between 4pm and 8pm.",
            "FRIDAY: $15 pitchers. $5 mixed drinks.",
            "SATURDAY: $15 pitchers. $5 mixed drinks.",
            "SUNDAY: $3.50 rails and domestic bottles."
        };
    }

    @Callable
    public static String getOffers(int day) {
        if((day == 0) || (day == 1) || (day == 2) || (day == 3) || (day == 4) || (day == 5) || (day == 6) || (day == 7)) {
            return offersArray[day];
        } else {
            return "Invalid day.";
        }
    }
}
