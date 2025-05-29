package JavaLearning;

public class Array {
    public static void main(String[] args){
        // Arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        System.out.println(cars[0]);
        System.out.println(myNum[1]);
        

        
        // Multi-Dimensional Arrays (Mảng nhiều chiều)
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Kết quả: 7

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Kết quả: 9

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

        for (int[] row : myNumbers) {
            for (int num : row) {
                System.out.println(num);
            }
        }  
    }


}
