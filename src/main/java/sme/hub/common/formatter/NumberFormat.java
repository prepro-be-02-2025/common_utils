package sme.hub.common.formatter;

import java.text.DecimalFormat;

public class NumberFormat {
    public static String format(double number) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        return df.format(number);
    }
    public static String format(int number) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        return df.format(number);
    }
}
