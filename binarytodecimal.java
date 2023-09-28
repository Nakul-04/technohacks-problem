import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();

        int decimal = binaryToDecimal(binaryStr);

        System.out.println("Decimal equivalent: " + decimal);
    }

    public static int binaryToDecimal(String binaryStr) {
        int decimal = 0;
        int binaryLength = binaryStr.length();

        for (int i = 0; i < binaryLength; i++) {
            char bit = binaryStr.charAt(i);
            int bitValue = Character.getNumericValue(bit);

            if (bitValue != 0 && bitValue != 1) {
                System.out.println("Invalid binary input.");
                System.exit(1);
            }

            int power = binaryLength - 1 - i;
            decimal += bitValue * Math.pow(2, power);
        }

        return decimal;
    }
}
