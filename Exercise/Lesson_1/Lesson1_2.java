package Exercise.Lesson_1;

public class Lesson1_2 {
    public static void main(String[] args){
        if (args.length < 3) {
            System.out.println("Vui lòng nhap 3 tham số diem Toan, Ly, Hoa.");
            System.out.println("Vi dụ: java Lesson1 9 8.5 7");
            return;
        }

        // Ép kiểu từ String sang double
        double diemToan = Double.parseDouble(args[0]);
        double diemLy = Double.parseDouble(args[1]);
        double diemHoa = Double.parseDouble(args[2]);

        double[] diems = {diemToan, diemLy, diemHoa};
        for (double diem : diems) {
            if (diem < 0 || diem > 10) {
                System.out.println("Diem ban nhap khong hop le, vui long nhap lai");
                return;
            }
        }           
        
        // Tính điểm trung bình
        double diemTB = (diemToan + diemLy + diemHoa) / 3;
        System.out.printf("Diem trung binh la: %.1f\n", diemTB);

        // Xếp loại
        if (diemTB >= 8){
            System.out.println("Gioi");
        } else if (diemTB >= 6.5){
            System.out.println("Kha");
        } else if (diemTB >= 5){
            System.out.println("Trung binh");
        } else {
            System.out.println("Yeu");
        }
    }
}
