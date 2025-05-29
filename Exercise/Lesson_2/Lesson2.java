package Exercise.Lesson_2;

public class Lesson2 {
    public static void main(String[] args){
        String text = "hello";
        String check = "";

        for (int i = (text.length()-1); i >= 0 ; i--){
            check += text.charAt(i);
            // System.out.println(check);
        }

        System.out.println(check);
        
        if (text.equals(check)){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not palindrome!");  
        }
       
    }
}
