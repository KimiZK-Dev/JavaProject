package JavaLearning.Methods;

public class Methods {
    static void myMethod() {
        System.out.println("Hello from myMethod!");
    }

    public static void main(String[] args) {
        myMethod(); // Gọi method bạn đã định nghĩa
    }
}


// | Thành phần trong khai báo | Ý nghĩa                                                         |
// | ------------------------- | --------------------------------------------------------------- |
// | myMethod()                | Tên của method (tùy ý đặt tên theo quy tắc đặt tên của Java)    |
// | static                    | Phương thức này thuộc về class, không cần tạo object để gọi     |
// | void                      | Phương thức không trả về giá trị nào cả                         |
