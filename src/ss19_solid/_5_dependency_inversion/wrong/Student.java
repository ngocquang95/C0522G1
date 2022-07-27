package ss19_solid._5_dependency_inversion.wrong;

public class Student {
    private int id;
    private String name;
    private double score;
    private LaptopDell laptopDell;

    public Student() {
    }

    public Student(int id, String name, double score, LaptopDell laptopDell) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.laptopDell = laptopDell;
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
        this.score = score;
    }

    public String getInfo() {
        return String.format("%s,%s,%s\n", this.getId(), this.getName(), this.getScore());
    }

    public LaptopDell getLaptopDell() {
        return laptopDell;
    }

    public void setLaptopDell(LaptopDell laptopDell) {
        this.laptopDell = laptopDell;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
