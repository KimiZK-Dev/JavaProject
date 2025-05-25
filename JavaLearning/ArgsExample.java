package JavaLearning;

public class ArgsExample {
    public static void main(String[] args) {
        System.out.println("So luong tham so: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Tham so " + i + ": " + args[i]);
        }
    }
}
