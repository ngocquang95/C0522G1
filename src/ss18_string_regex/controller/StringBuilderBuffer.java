package ss18_string_regex.controller;

public class StringBuilderBuffer {
    public static void main(String[] args) {
//        String name = "            Nguyễn Tấn Huân";
//        name += " Đẹp trai!!!                     ";

//        System.out.println(name.trim());

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Nguyễn Tất Thành");

        stringBuilder.append(" Đẹp trai!!!");

        System.out.println(stringBuilder);
    }
}
