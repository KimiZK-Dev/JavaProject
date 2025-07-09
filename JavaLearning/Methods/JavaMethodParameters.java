package JavaLearning.Methods;

public class JavaMethodParameters {
    // Phương thức tĩnh myMethod nhận tham số fname và in ra tên kèm "Refsnes"
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    // Phương thức main là điểm bắt đầu của chương trình
    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }

    // Constructor mặc định
    public JavaMethodParameters() {
    }
}