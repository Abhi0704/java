import java.util.Scanner;

public class DecimalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number");
        double decimalNumber = sc.nextDouble();

        String doubleString = String.valueOf(decimalNumber);
        int indexOfDecimal = doubleString.indexOf(".");


        System.out.println("Integer Part: " + doubleString.substring(0, indexOfDecimal));
        System.out.println("Decimal Part: " + doubleString.substring(indexOfDecimal+1));

        if (doubleString.substring(indexOfDecimal + 1).equals(doubleString.substring(0, indexOfDecimal))) {

            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
