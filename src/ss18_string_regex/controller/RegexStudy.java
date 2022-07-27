package ss18_string_regex.controller;

public class RegexStudy {
    public static void main(String[] args) {
//        Biểu diễn miền giá trị [...] = > Kiểm tra một ký tự có nằm trong tập ký tự mong muốn hay không?
//        Dấu gạch ngang (-) => Tự động tạo cho chúng ta một dãy các ký tự liên tục
        System.out.println(" ".matches("[a-zA-Z0-9]"));

//        Ngoại trừ tập hợp ký tự mẫu khi nằm trong []
        System.out.println(" ".matches("[^a-zA-Z0-9]"));

// Sử dụng ký tự *  => 0 hoặc nhiều lần lặp lại
        System.out.println("baaaaaaaaaac".matches("ba*c"));

        // Ký tự đầu tiên là chữ hoa - Những ký tự phía sau phải toàn số
        System.out.println("A12351".matches("[A-Z][0-9]*"));

        // Sử dụng ký tự +  => 1 hoặc nhiều lần lặp lại
        System.out.println("baaaaaaaaaac".matches("ba*c"));

        // Sử dụng ký tự ?  => 0 hoặc 1 lần
        System.out.println("baaaaaaaaaac".matches("ba*c"));


        // Sử dụng ký tự ngoặc ngọn {} => Quy định việc lặp lại của một ký tự hoặc một ký tự trong một tập ký tự [...]
        // {n} Có n ký tự
        System.out.println("999".matches("[0-9]{3}"));

        // {n,m} Có n đến m ký tự
        System.out.println("999".matches("[0-9]{3,4}"));

        // {n,} Có ít nhất n ký tự trở lên
        System.out.println("999".matches("[0-9]{2,}"));


        System.out.println("A999".matches("A([a-zA-Z]{3,5}|[0-9]{3,6})"));


        System.out.println("".matches("\\d"));
        System.out.println("A999A999".matches("(A999){2}"));
        System.out.println("A(+".matches("A[(][+]"));
    }
}
