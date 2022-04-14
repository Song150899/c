public class QuanlySv implements Quanly<Student> {
    private Student[] list = new Student[4];
    private int size = 0;


    @Override
    public void add(Student student) {
        list[size] = student;
        size++;

    }

    @Override
    public void fix(String name, Student student) {
        list[search(name)] = student;
    }

    @Override
    public int search(String name) {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i].getName());
            if (name.equals(list[i].getName())) {
                return i;

            }
        }
        return -1;

    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);

        }
        System.out.println("================");


    }

    public static void main(String[] args) {
        QuanlySv ql = new QuanlySv();
        Student student1 = new Student(1, " Đạt", 19, 5.4);
        Student student2 = new Student(2, " Song", 19, 6.0);
        Student student3 = new Student(3, " Vũ", 19, 7.4);
        Student student4 = new Student(4, " Đức", 19, 9.25);

        ql.add(student1);
        ql.add(student2);
        ql.add(student3);
        ql.add(student4);

        ql.print();

        System.out.println(ql.search(" Vũ"));

        Student student5 = new Student(3, " Hồng", 19, 8.0);

        ql.fix(" Vũ", student5);

        ql.print();

    }
}

