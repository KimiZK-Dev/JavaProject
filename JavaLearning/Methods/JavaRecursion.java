package JavaLearning.Methods;

public class JavaRecursion {
    public static void main(String[] args){
        int r = sum(10);
        int r2 = sum2(5, 10);
        System.out.println(r);
        System.out.println(r2);
    };

    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n-1);
    }

    public static int sum2(int n, int k) {
        if (k > n) return k + sum2(n, k-1);
        return k;
    }
}
