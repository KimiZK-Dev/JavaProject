package JavaLearning;

public class NestedLoops {
    public static void main(String[] args) {

        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Chạy 2 lần

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j); // Chạy 3 lần mỗi lần outer -> tổng cộng 6 lần
            }

            // Nest bên trong outer loop: chạy thêm 6 lần in ra cùng dòng
            for (int k = 1; k <= 2; k++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print(k + "," + j + " ");
                }
            }

            System.out.println(); // Xuống dòng để tách rõ mỗi vòng outer
        }
    }
}
