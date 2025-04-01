import java.util.Scanner;

public class BinaryToDecimal {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c != '0' && c != '1') {
                throw new BinaryFormatException("Invalid binary character: '" + c + "'");
            }
        }

        int decimal = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            char c = binaryString.charAt(i);
            int bit = c - '0';
            decimal = decimal * 2 + bit;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();

        try {
            int decimal = bin2Dec(binaryString);
            System.out.println("Decimal equivalent: " + decimal);
        } catch (BinaryFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Not a binary number");
        }

        input.close();
    }
}