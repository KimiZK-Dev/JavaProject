package Exercise.TimHieuThem;
import java.util.Scanner;

public class ScannerEx{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ten cua ban: ");
        String name = scanner.nextLine();

        System.out.print("Nhap tuoi cua ban: ");
        int age = scanner.nextInt();

        System.out.print("Ban ten la: " + name + "\nTuoi cua ban la: " + age);
        scanner.close();
    }
}



/*

| Phương thức     | Kiểu dữ liệu trả về   | Ý nghĩa / Chức năng                                          | Ví dụ                            |
| --------------- | --------------------- | ------------------------------------------------------------ | -------------------------------- |
| next()          | String                | Đọc một từ (kết thúc khi gặp dấu cách)                       | String name = sc.next();         |
| nextLine()      | String                | Đọc nguyên một dòng (tính cả dấu cách, kết thúc khi Enter)   | String line = sc.nextLine();     |
| nextInt()       | int                   | Đọc một số nguyên                                            | int age = sc.nextInt();          |
| nextDouble()    | double                | Đọc một số thực (có dấu chấm thập phân)                      | double d = sc.nextDouble();      |
| nextFloat()     | float                 | Đọc một số thực kiểu float                                   | float f = sc.nextFloat();        |
| nextLong()      | long                  | Đọc một số nguyên dài                                        | long l = sc.nextLong();          |
| nextShort()     | short                 | Đọc một số nguyên ngắn                                       | short s = sc.nextShort();        |
| nextByte()      | byte                  | Đọc một số nguyên rất nhỏ                                    | byte b = sc.nextByte();          |
| nextBoolean()   | boolean               | Đọc giá trị true hoặc false                                  | boolean flag = sc.nextBoolean(); |


| Phương thức      | Ý nghĩa                     |
| ---------------- | --------------------------- |
| hasNext()        | Có dữ liệu tiếp theo không? |
| hasNextLine()    | Có dòng tiếp theo không?    |
| hasNextInt()     | Có phải số nguyên không?    |
| hasNextDouble()  | Có phải số thực không?      |
| hasNextBoolean() | Có phải true/false không?   |


*/