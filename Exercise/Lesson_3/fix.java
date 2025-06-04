package Exercise.Lesson_3;

import java.util.Scanner;

public class fix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chao mung den voi may tinh don gian!");

        float a = nhapSo(sc, "Nhap so thu nhat: ");
        float b = nhapSo(sc, "Nhap so thu hai: ");

        System.out.print("Nhap phep toan (+, -, *, /): ");
        String phepToan = sc.nextLine().trim();

        switch (phepToan) {
            case "+":
                System.out.printf("Ket qua: %.2f + %.2f = %.2f\n", a, b, a + b);
                break;
            case "-":
                System.out.printf("Ket qua: %.2f - %.2f = %.2f\n", a, b, a - b);
                break;
            case "*":
                System.out.printf("Ket qua: %.2f * %.2f = %.2f\n", a, b, a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Loi: Khong the chia cho 0!");
                } else {
                    System.out.printf("Ket qua: %.2f / %.2f = %.2f\n", a, b, a / b);
                }
                break;
            default:
                System.out.println("Phep toan khong hop le. Chi chap nhan +, -, *, /.");
        }

        sc.close();
    }

    private static float nhapSo(Scanner sc, String thongBao) {
        while (true) {
            System.out.print(thongBao);
            try {
                return Float.parseFloat(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so hop le!");
            }
        }
    }
}
