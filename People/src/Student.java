public class Student extends People implements Comparable<Student> {
    private double point;

    public Student() {
    }

    public Student(float point) {
        this.point = point;
    }

    public Student(int code, String name, int age, double point) {
        super(code, name, age);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{ " +
                " Code:" + getCode() +
                " Name:" + getName() +
                " Age:" + getAge() +
                " Point:" + point +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.getPoint() - o.getPoint());
    }
}
