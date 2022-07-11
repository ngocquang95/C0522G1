package ss1_introduction;

public class ScannerPrint {
    public static void main(String[] args) {
        //System.in là một tiêu chuẩn để nhập dữ liệu từ bàn phím
//        Scanner scanner = new Scanner(System.in);
//
//        // Phải lưu ý trong trường hợp nhập số xong đến nhập chuỗi
//        System.out.print("Nhập vào điểm: ");
//        double score = Double.parseDouble(scanner.nextLine());
//
//        System.out.print("Nhập vào tên: ");
//        String fullName = scanner.nextLine();
//
//        System.out.println("Điểm: "  + score);
//        System.out.println("Tên: "  + fullName);
//
//       char c = scanner.nextLine().charAt(0);

        // =============== System.out.print ===============
//        System.out.print("Line 23");
//        System.out.print();
        //System.out.printf();

        int a = 1, b = 2;
        //1 + 2 = 3
//        System.out.println(a + " + " + b + " = " + (a + b));
//        System.out.printf("%d + %d = %d", a, b, a + b);


        double score = 2.0;
        System.out.printf("%-10.2f", score);
        String str = String.format("%-10.2f", score);
    }
}
