package JavaLearning;

public class MathExample {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));     
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7)); 
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);
    }
}
