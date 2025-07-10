package JavaLearning.Methods;

public class JavaScope {
    public static void main(String[] args) {

        // Không thể dùng biến x ở đây

        { 
        // Không thể dùng biến x ở đây
        int x = 100;

        // Có thể dùng biến x ở đây
        System.out.println(x);
        }  // Khối code

     // Không thể dùng biến x ở đây
    }
}



// Trong Java, block {} có thể viết ở bất cứ đâu trong method để tạo phạm vi cục bộ (local scope).