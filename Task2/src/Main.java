import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в десятичной системе счисления: ");
        int decimalNumber = scan.nextInt();
        System.out.print("Введите основание системы счисления (от 2 до 36): ");
        int base = scan.nextInt();
        if (base < 2 || base > 36) {
            System.out.println("Основание системы счисления должно быть от 2 до 36.");
        }
        String converted = convertDecimalToAny(decimalNumber, base);
        System.out.println("Число " + decimalNumber + " в системе счисления с основанием " + base + " равно: " + converted);
    }

    public static String convertDecimalToAny(int decimalNumber, int base) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            char digit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
            result.insert(0, digit);
            decimalNumber /= base;
        }

        return result.toString();
    }
}