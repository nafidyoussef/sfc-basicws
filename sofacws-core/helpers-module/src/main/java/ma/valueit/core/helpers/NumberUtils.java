package ma.valueit.core.helpers;

import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by valueit-mac-yelansari on 8/29/17.
 */
public class NumberUtils {
    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static boolean isNullOrNegative(Integer number) {
        return (number == null || number < 0);
    }

    public static boolean isNullOrNegative(Double number) {
        return (number == null || number < 0);
    }

    public static boolean isPositifStrict(Double number) {
        return (number != null && number > 0);
    }

    public static boolean isNegative(Double number) {
        return number != null && number < 0;
    }

    public static boolean isPositif(Double number) {
        return !isNullOrNegative(number);
    }

    public static boolean isNull(Double number) {
        return number == null;
    }


    public static String getDecimalFormat(Double number) {
        NumberFormat formatter = new DecimalFormat("#0.00");

        return formatter.format(number);
    }

    public static boolean isNumeric(String str) {
        return StringUtils.isNumeric(str);
    }
}
