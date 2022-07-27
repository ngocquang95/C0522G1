package point20.model;

public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s\n", this.getId(), this.getName(), this.getSalary());
    }


    public Teacher(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
