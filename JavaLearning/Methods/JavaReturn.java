package JavaLearning.Methods;

public class JavaReturn {
    static int myMethod(int x) {
        return 5 + x;
    }
    
    static int myMethod2(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(myMethod2(3, 4));
    }
}


