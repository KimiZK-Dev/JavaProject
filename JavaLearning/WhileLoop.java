package JavaLearning;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 4) {
            System.out.println("index (i): " + i);
            i++;
        }
        
        
        int j = 0;
        do {
            System.out.println("index (j): " + j);
            j++;
        }
        while (j < 5);
    } 
}
