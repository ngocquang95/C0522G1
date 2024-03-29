package point20.model;

public class Student extends Person {
    private double score;

    public Student() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s\n", this.getId(), this.getName(), this.getScore());
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "score=" + score +
                '}';
    }
}
