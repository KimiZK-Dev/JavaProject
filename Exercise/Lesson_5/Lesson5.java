package Exercise.Lesson_5;
import java.util.Scanner;
import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach cac so nguyen: \nVi du: 2 412 14 81 173 ...");
        String input = sc.nextLine();                          
        String[] parts = input.trim().split("\\s+");   
        // System.out.println(Arrays.toString(parts));
        
        if (parts.length > 100) {
            sc.close();
            return;
        }
        
        int[] listInt = new int[parts.length];          // [0, 0, 0, 0, 0, ...]            
        for (int i = 0; i < parts.length; i++) {
            listInt[i] = Integer.parseInt(parts[i]);    // Gán số nguyên đã được chuyển đổi từ String qua Int vào listInt. VD: [1, 4, 2, 6, ...]
        }
        
        long startTime = System.nanoTime();
        for (int i = 0; i < listInt.length - 1; i++) {
            // System.out.println("OK: " + listInt[i]);
            for (int j = 0; j < listInt.length - 1 - i; j++) {
                // System.out.println(listInt[j]);
                if (listInt[j] > listInt[j + 1]) {
                    int temp = listInt[j];
                    listInt[j] = listInt[j + 1];
                    listInt[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();

        // In ra kiểm tra
        System.out.println("Truoc: " + Arrays.toString(parts));
        System.out.println("Sau: " + Arrays.toString(listInt));
        System.out.println("Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        sc.close();
    }
}
