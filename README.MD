## 📚 Java Learning Project - W3Schools Based

### 🔰 Giới thiệu

Đây là project học **Java cơ bản đến nâng cao**, được tổ chức và luyện tập dựa theo lộ trình của [W3Schools - Java Tutorial](https://www.w3schools.com/java/).

Toàn bộ mã nguồn được phân chia theo từng chủ đề, giúp học từng bước, có ví dụ, bài tập, file `.class`, `.java` và tài liệu bổ sung.

---

### 🗺️ Lộ trình học Java (theo W3Schools)

> Dưới đây là danh sách các mục tiêu học tập được chia thành 6 nhóm chính:

#### 1. 🔹 Java Cơ bản

* Intro, Syntax, Output, Comments
* Variables, Data Types, Type Casting
* Operators, Strings, Math, Booleans
* If/Else, Switch, Loops (While, For)
* Break/Continue, Arrays

#### 2. 🔹 Java Methods

* Methods, Parameters, Overloading
* Scope, Recursion

#### 3. 🔹 Java OOP

* Classes/Objects, Attributes, Methods
* Constructors, `this`, Modifiers
* Inheritance, Polymorphism, Abstraction, Interfaces, Enums
* Inner Classes, Encapsulation, Packages/API

#### 4. 🔹 Java Xử lý lỗi & File

* Errors, Debugging, Exceptions
* File Handling (Read, Write, Delete)

#### 5. 🔹 Java Collections & Data Structures

* List, ArrayList, LinkedList, Set, Map
* Sorting, Iterators

#### 6. 🔹 Java Nâng cao & How-To

* Wrappers, Generics, Lambda, Threads, Regex
* Ứng dụng nhỏ: đảo chuỗi, tìm số lớn nhất, tính tổng mảng,...

---

### 🗂️ Cấu trúc thư mục

```
📁 Class/                → Chứa file biên dịch (.class)
📁 Exercise/             → Bài tập thực hành theo từng bài học
📁 JavaLearning/         → Mã nguồn chính học theo lộ trình
    📁 Methods/          → Các bài học liên quan đến Java Methods
        📁 Test/         → Bài kiểm tra nhỏ / ví dụ nâng cao
📄 README.md             → File mô tả dự án này
```

---

### 🧠 Cách học hiệu quả

1. **Đọc lý thuyết** tại [W3Schools Java](https://www.w3schools.com/java/)
2. **Xem code mẫu** trong `JavaLearning/`
3. **Làm bài tập thực hành** tại thư mục `Exercise/`
4. **Biên dịch & chạy code**
5. **So sánh file `.java` và `.class`** trong `Class/` để hiểu kết quả biên dịch
6. **Ghi chú hoặc tài liệu thêm** nằm trong `TimHieuThem/`

---

### ⚙️ Cách biên dịch và chạy Java

> Sử dụng **terminal / command line**, di chuyển đến thư mục chứa file `.java`.

#### 📦 Biên dịch:

```bash
javac TenFile.java
```

VD:

```bash
javac HelloWorld.java
```

Dưới đây là phần **đã chỉnh sửa lại nội dung "Cách chạy chương trình"** theo yêu cầu của bạn, sẵn sàng để chèn vào `README.md`:

---

### ⚙️ Cách chạy chương trình

#### 🧾 Clone project:

```bash
git clone https://github.com/KimiZK-Dev/JavaProject.git
cd JavaProject
```

#### ▶️ Biên dịch và chạy:

```bash
javac Exercise/Lesson_1/Lesson1.java
java Exercise.Lesson_1.Lesson1
```

> ⚠️ **Lưu ý:** Nếu bạn sử dụng `package` trong file `.java`, hãy chắc chắn rằng bạn **biên dịch và chạy đúng theo cấu trúc thư mục tương ứng** với tên gói. Ví dụ:

```java
package Exercise.Lesson_1;
```

Thì file phải được đặt trong thư mục `Exercise/Lesson_1/` và chạy bằng lệnh:

```bash
java Exercise.Lesson_1.TenLop
```

> ⚠️ **Lưu ý:** Không thêm `.java` khi chạy chương trình.

