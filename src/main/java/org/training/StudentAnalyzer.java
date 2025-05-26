package org.training;

import java.util.List;

/**
 * Class phân tích điểm số học sinh.
 */
public class StudentAnalyzer {

    /**
     * Đếm số học sinh đạt loại Giỏi (điểm >= 8.0).
     * Bỏ qua điểm không hợp lệ (âm hoặc > 10) và null.
     * Nếu danh sách null hoặc rỗng trả về 0.
     * @param scores danh sách điểm từ 0 đến 10
     * @return số học sinh loại Giỏi
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10) {
                if (score >= 8.0) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Tính điểm trung bình các điểm hợp lệ (0 đến 10), bỏ qua null và điểm sai.
     * Nếu danh sách null, rỗng hoặc không có điểm hợp lệ, trả về 0.
     * @param scores danh sách điểm
     * @return điểm trung bình hợp lệ
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0.0;

        double sum = 0;
        int validCount = 0;

        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }

        if (validCount == 0) return 0.0;

        return sum / validCount;
    }
}
