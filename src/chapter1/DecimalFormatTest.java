package chapter1;

import java.text.DecimalFormat;
public class DecimalFormatTest {
    public static void main(String[] args) {
        // makes pattern like Rs 12,345, $12, 123, 121
        String pattern = "0, 00, 00.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        System.out.println(decimalFormat.format(12.23434));
        System.out.println(decimalFormat.format(22312.12));
    }
}
