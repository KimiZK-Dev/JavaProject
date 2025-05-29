package Exercise.Lesson_1;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double diemToan = nhapDiem(scanner, "Toan");
        double diemLy = nhapDiem(scanner, "Ly");
        double diemHoa = nhapDiem(scanner, "Hoa");

        double diemTB = (diemToan + diemLy + diemHoa) / 3;
        System.out.printf("Diem trung binh la: %.1f\n", diemTB);
        System.out.println("Xep loai: " + xepLoai(diemTB));

        scanner.close();
    }

    public static double nhapDiem(Scanner scanner, String mon) {
        System.out.print(mon + ": ");
        double diem = scanner.nextDouble();
        if (diem < 0 || diem > 10) {
            System.out.println("Diem " + mon + " khong hop le (0 den 10).");
            System.exit(1);
        }
        return diem;
    }

    public static String xepLoai(double diemTB) {
        if (diemTB >= 8) return "Gioi";
        else if (diemTB >= 6.5) return "Kha";
        else if (diemTB >= 5) return "Trung binh";
        else return "Yeu";
    }
}
