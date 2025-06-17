package Exercise.Lesson_5;

import java.util.Arrays;
import java.util.Scanner;

public class fix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach cac so nguyen (toi da 100 so, cach nhau boi dau cach):");
        String input = sc.nextLine().trim();

        // Tách và kiểm tra số lượng phần tử
        String[] parts = input.split("\\s+");
        if (parts.length > 100) {
            System.out.println("Loi: Ban chi duoc nhap toi da 100 so!");
            sc.close();
            return;
        }

        // Chuyển sang mảng int
        int[] numbers;
        try {
            numbers = parseInputToArray(parts);
        } catch (NumberFormatException e) {
            System.out.println("Loi: Chi duoc nhap so nguyen hop le!");
            sc.close();
            return;
        }

        System.out.println("Truoc khi sap xep: " + Arrays.toString(numbers));

        long startTime = System.nanoTime();  // Bắt đầu tính thời gian
        bubbleSort(numbers);                // Sắp xếp
        long endTime = System.nanoTime();    // Kết thúc tính thời gian

        System.out.println("Sau khi sap xep: " + Arrays.toString(numbers));
        System.out.printf("Thoi gian thuc thi: %.4f ms%n", (endTime - startTime) / 1_000_000.0);

        sc.close();
    }

    // Chuyển mảng String sang int[]
    public static int[] parseInputToArray(String[] parts) throws NumberFormatException {
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }

    // Bubble Sort cải tiến
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Không còn hoán đổi → đã sắp xếp xong
        }
    }
}
