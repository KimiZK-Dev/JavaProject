package JavaLearning;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("index:" + i);
        }


        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        int i = 0;
        for ( ; i < 3; ) {
            System.out.println("index (i):" + i);
            i++;
        }


        for (;;) {
            System.out.println("Running forever...");
            break;  // nên có điều kiện dừng
        }        


        for (int k = 0, j = 5; k < j; k++, j--) {
            System.out.println("k: " + k + ", j: " + j);
        }
    } 
}




/*

for (statement 1; statement 2; statement 3) {
   // code block to be executed
}
| Phần         | Chức năng                                                                                                    |
| ------------ | ------------------------------------------------------------------------------------------------------------ |
| `statement1` | Khởi tạo biến lặp – chạy một lần duy nhất trước khi vòng lặp bắt đầu.                                        |
| `statement2` | Điều kiện kiểm tra trước mỗi vòng lặp. Nếu đúng (true), code trong vòng sẽ chạy. Nếu sai, vòng lặp kết thúc. |
| `statement3` | Cập nhật – được thực hiện sau mỗi lần chạy code trong vòng lặp. Thường dùng để tăng hoặc giảm biến.          |


for (type variableName : arrayName) {
  // code block to be executed
}
| Thành phần        | Ý nghĩa                                                                 |
| ----------------- | --------------------------------------------------------------------------- |
| type              | Kiểu dữ liệu của từng phần tử trong mảng hoặc collection.                   |
| variableName      | Tên biến tạm đại diện cho phần tử hiện tại trong mỗi vòng lặp.              |
| arrayName         | Tên của mảng hoặc collection mà bạn muốn duyệt qua.                         |
| : (dấu hai chấm)  | Có nghĩa là "duyệt qua" – biểu thị mối quan hệ giữa phần tử và tập dữ liệu. |


| Cú pháp                          | Dùng khi nào                         |
| -------------------------------- | ------------------------------------ |
| for (int i = 0; i < n; i++)      | Lặp với biến đếm đơn giản            |
| for (Type item : array)          | Duyệt mảng hoặc danh sách (for-each) |
| for (; condition;)               | Kiểm soát biến ở ngoài vòng          |
| for (;;)                         | Lặp vô hạn (nên có `break`)          |
| for (int i=0,j=10; i<j; i++,j--) | Lặp với nhiều biến cùng lúc          |

 */