package ss5_static_access_modifier._static;

/**
 *
 */
class Student {
    int id;
    private String name;
    static String college;
//    static String college = "Bách khoa Đà Nẵng"; // cách 1
    static int count = 0;

    private double score;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10) {
            System.out.println("Nhập điểm sai");
            // sẽ được nói rỏ hơn trong bài Exception
        } else {
            this.score = score;
        }

    }

    /**
     * THis is method display
     */
     void display() {
         int a; // a được gọi là biến cục bộ
        System.out.printf("%d - %s - %s\n", id, name, college);
    }

    static {
        college = "Bách khoa Đà Nẵng"; // cách 2
    }

    public static void main(String[] args) {
       Student s1 = new Student(1, "Nguyễn Văn A");
        Student s2 = new Student(2, "Nguyễn Văn B");
        s1.display(); // 1 - Nguyễn Văn A - Bách Khoa Đà Nẵng
        s2.display(); // 2 - Nguyễn Văn B - Bách Khoa Đà Nẵng

        Student.college = "Đại Học Hà Nội";
        s1.display(); //1 - Nguyễn Văn A - Đại Học Hà Nội
        s2.display(); // 2 - Nguyễn Văn A - Đại Học Hà Nội

        System.out.println("Số lượng sinh viên: " + Student.count);

        System.out.println(Math.max(1, 2));
    }
}
