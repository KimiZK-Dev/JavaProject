package Exercise.Lesson_3;

import java.util.Scanner;
public class Lesson3 {
    public static void main(String[] args){
        if (args.length < 2){
            System.out.println("Ban chua nhap 2 so lam dau vao!");
            System.out.println("Vi du: java -cp Class Exercise.Lesson_3.Lesson3 34 13");
            return;
        }

        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap phep toan (+, -, *, /): ");
        String operation  = sc.nextLine().trim();

        switch (operation ) {
            case "+":
                System.out.println("Ket qua: "+ (a + b));
                break;
            case "-":
                System.out.println("Ket qua: "+ (a - b));
                break;
            case "*":
                System.out.println("Ket qua: "+ (a * b));
                break;
            case "/":
                if (b == 0){
                    System.out.println("Khong the chia cho 0");
                }else{
                    System.out.println("Ket qua: "+ (a / b));
                }
                break;
            default:
                System.out.println("Chi cho phep chon nhung stt cho nhu tren!");
                break;
        }

        sc.close();
    }
}
