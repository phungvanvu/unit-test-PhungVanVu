1. Mô tả yêu cầu chức năng
Viết một chương trình Java có lớp StudentAnalyzer chứa phương thức:

public class StudentAnalyzer {
    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng, trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        // TODO: Sinh viên viết mã tại đây
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     */
    public double calculateValidAverage(List<Double> scores) {
        // TODO: Sinh viên viết mã tại đây
    }
}

Yêu cầu kỹ thuật của phương thức:
Điều kiện 1: Nếu điểm nhỏ hơn 0 hoặc lớn hơn 10 thì bỏ qua (validate).

Điều kiện 2: Nếu danh sách rỗng thì trả về kết quả mặc định (0).

Vòng lặp 1: Duyệt qua danh sách điểm để lọc học sinh giỏi.

Vòng lặp 2: Duyệt qua danh sách để tính trung bình hợp lệ.

2. Yêu cầu kiểm thử với JUnit
Sinh viên cần viết ca kiểm thử (test case) đơn vị cho mỗi phương thức trên:

Trường hợp bình thường:

Danh sách có nhiều điểm hợp lệ và không hợp lệ.

Danh sách toàn bộ hợp lệ.

Trường hợp biên:

Danh sách trống.

Danh sách chỉ chứa giá trị 0 hoặc 10.

Trường hợp ngoại lệ:

Có điểm < 0 hoặc > 10.


3. Quy trình nộp bài
Bước 1. Tạo GitHub Repository
Đặt tên repo theo định dạng: unit-test-[HọTênKhôngDấu] (ví dụ: unit-test-NguyenVanA)

Chia repo làm 2 thư mục:

src/ chứa mã nguồn Java

test/ chứa các file test JUnit

Bước 2: Tạo các Issues trên GitHub
Tạo ít nhất 4 Issues sau:

Tên Issue	Mô tả
Viết hàm countExcellentStudents()	Cần xử lý kiểm tra điểm hợp lệ và đếm học sinh giỏi
Viết hàm calculateValidAverage()	Tính trung bình các điểm hợp lệ
Viết test cho 2 hàm trên	Dùng JUnit để kiểm thử đầy đủ
Viết tài liệu README.md	Mô tả bài toán, cách chạy chương trình, test
Bước 3: Thực hiện commit gắn với issue
Khi thực hiện từng việc, sinh viên cần:

Ghi rõ commit message liên kết với issue, ví dụ:

feat: implement countExcellentStudents() #1
test: add unit tests for both methods #3
docs: update README with instructions #4
Cú pháp #1 sẽ tự động liên kết commit với issue số 1, và nếu dùng từ khóa như fixes #1 hoặc closes #1 sẽ tự động đóng issue khi merge vào nhánh chính.

Bước 4. Nộp bài lên LMS
Tạo README.md mô tả bài tập và hướng dẫn chạy test.

Nộp đường link GitHub repo vào hệ thống LMS (mục "Bài tập thực hành kiểm thử với JUnit").