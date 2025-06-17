package Exercise.Test;
import java.util.Arrays; 

public class a {
    public static void main(String[] args){
        int[] a = new int[10];
        System.out.println(Arrays.toString(a));
        int[] temp = {1, 2, 3}; 
        System.arraycopy(temp, 0, a, 1, temp.length); 
        System.out.println(Arrays.toString(a));
    }
}






// System.arraycopy(src, srcPos, dest, destPos, length);
// | Tham số   | Ý nghĩa                                                                  |
// | --------- | ------------------------------------------------------------------------ |
// | src       | Mảng nguồn (mảng bạn muốn sao chép từ)                                   |
// | srcPos    | Vị trí bắt đầu trong mảng nguồn để sao chép (chỉ số bắt đầu trong src)   |
// | dest      | Mảng đích (mảng bạn muốn sao chép vào)                                   |
// | destPos   | Vị trí bắt đầu trong mảng đích để dán dữ liệu vào                        |
// | length    | Số phần tử cần sao chép                                                  |