import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число элементов n: ");
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print((i + 1) + "-й элемент: ");
            a[i] = input.nextInt();
        }

        System.out.println("Числа-полиндромы:");
        for (int value : a) {
            if (isPalindrome(value)) {
                System.out.print(value + " ");
            }
        }
    }

    public static boolean isPalindrome(int value) {
        return value == reverseNumber(value);
    }

    public static int reverseNumber(int number) {
        int value = number;
        int total = 0;
        while (value > 0) {
            total = total * 10 + value % 10;
            value /= 10;
        }
        return total;
    }
}