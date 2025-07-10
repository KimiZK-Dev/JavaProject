### Bài tập 10: Kiểm tra số nguyên tố
**Mô tả**: Viết một chương trình Java để kiểm tra xem một số có phải là số nguyên tố hay không. Yêu cầu:
- Tạo một phương thức `isPrime` nhận một tham số `number` (kiểu `int`) và trả về `true` nếu số đó là số nguyên tố, `false` nếu không.
- Sử dụng **đệ quy** để tạo một phương thức phụ `checkPrime` kiểm tra xem số có bị chia hết bởi các số từ 2 đến căn bậc hai của nó hay không.
- Sử dụng **method overloading** để tạo một phiên bản khác của `isPrime` nhận thêm một tham số `limit` (kiểu `int`) để giới hạn kiểm tra chia hết đến một giá trị cụ thể.
- Đảm bảo các biến trong phương thức có **scope** phù hợp.
- Trong hàm `main`, cho phép người dùng nhập một số và gọi cả hai phiên bản của `isPrime` để hiển thị kết quả.