import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Question12 {
    public static void main(String[] args) {
        double number = 7.50;
        NumberFormat numberFormat = new DecimalFormat("#0.00");
        System.out.println(numberFormat.format(number));
    }
}