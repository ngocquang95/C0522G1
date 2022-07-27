package ss19_solid._5_dependency_inversion.correct;

public class Student {
    private int id;
    private String name;
    private double score;
    private Laptop laptop;

    public Student() {
    }

    public Student(int id, String name, double score, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.laptop = laptop;
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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
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
