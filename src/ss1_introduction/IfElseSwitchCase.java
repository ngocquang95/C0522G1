package ss1_introduction;

public class IfElseSwitchCase {
    public static void main(String[] args) {
        double score = 5;
        // Điểm < 5 rớt module
        // [5-7): khá
        // [7-10]: Xuất sắc

        // Cách thiếu nhi
        if (score >= 0 && score < 5) {
            System.out.println("Rớt");
        }

        if (score >= 5 && score < 7) {
            System.out.println("Khá");
        }

        if (score >= 7 && score <= 10) {
            System.out.println("Giỏi");
        }

        // Cách trưởng thành
        if (score >= 0 && score < 5) {
            System.out.println("Rớt");
        } else if (score >= 5 && score < 7) {
            System.out.println("Khá");
        } else if (score >= 7 && score <= 10) {
            System.out.println("Giỏi");
        }

        // Cách người từng trải
        if (score < 5) {
            System.out.println("Rớt");
        } else if (score < 7) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }

        int day = 2;
        // 2 =>  thứ 2
        // 3 => thứ 3
        switch (day) {
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            default:
                System.out.println("Không xác định");
        }
    }
}
