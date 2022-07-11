package ss3_method;

public class ByPassValueReference {
    public static void main(String[] args) {
        int a = 2;

        changeDate(a); // truyền tham trị


        System.out.println(a);// => Nếu như có tham chiếu tồn tại ở trên java => 100

//        int[] b = {1, 2};
//        changeDate(b);
//        System.out.println(Arrays.toString(b));
    }

    static void changeDate(int[] arr) {
        arr[0] = 10;
        arr = new int[2];
        arr[1] = 20;
    }

    static void changeDate(int n) {
        n = 100;
    }
}
