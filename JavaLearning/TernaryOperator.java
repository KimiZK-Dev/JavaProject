package JavaLearning;

public class TernaryOperator {
    public static void main(String[] args) {
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 75) ? "B" : "C";
        System.out.println("Grade: " + grade);
    }
}


// (condition) ? value_if_true : value_if_false;