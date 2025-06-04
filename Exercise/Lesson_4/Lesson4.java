package Exercise.Lesson_4;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num = nhapSoNguyen(sc, "Nhap mot so nguyen: ");
        
        if (num >= 1 && num <= 9) {
            for (int i = 1; i <= 10; i++) {
                int tich = num * i;

                if (tich > 50) {
                    continue;
                }

                if (tich % 7 == 0) {
                    break;
                }

                System.out.println(num + " x " + i + " = " + tich);
            }
        } else {
            System.out.println("Khong thuoc khoang hop le!");
        }

        sc.close();
    }

    private static int nhapSoNguyen(Scanner sc, String thongBao) {
        while (true) {
            System.out.print(thongBao);
            String input = sc.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen hop le!");
            }
        }
    }
}
