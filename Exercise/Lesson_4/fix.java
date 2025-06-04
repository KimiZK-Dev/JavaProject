package Exercise.Lesson_4;

import java.util.Scanner;

public class fix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen (1 - 9): ");
        int num;

        try {
            num = Integer.parseInt(sc.nextLine().trim());

            if (num < 1 || num > 9) {
                System.out.println("Khong thuoc khoang hop le!");
                sc.close();
                return;
            }

            for (int i = 1; i <= 10; i++) {
                int result = num * i;

                if (result > 50) continue;
                if (result % 7 == 0) break;

                System.out.println(num + " x " + i + " = " + result);
            }

        } catch (NumberFormatException e) {
            System.out.println("Vui long nhap so nguyen hop le!");
        }

        sc.close();
    }
}
