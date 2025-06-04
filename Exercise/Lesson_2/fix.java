package Exercise.Lesson_2;

import java.util.Scanner;

public class fix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();

        if (normalized.equals(reversed)) {
            System.out.println(input + " la Palindrome.");
        } else {
            System.out.println(input + " khong phai Palindrome.");
        }

        scanner.close();
    }
}
