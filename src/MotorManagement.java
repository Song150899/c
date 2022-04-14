import java.util.Arrays;

public class MotorManagement implements Manager<Motor> {
    private Motor[] list = new Motor[2];
    private int size = 0;

    @Override
    public void add(Motor motor) {
        list[size] = motor;
        size++;

    }

    @Override
    public void fix(String name, Motor motor) {
        list[search(name)]=motor;

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public int search(String name) {
        for (int i=0;i<size; i++){
            if (name == list[i].getName()){
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
        System.out.println("-------------");
    }

    @Override
    public void sort() {
        Arrays.sort(list);

    }

    public static void main(String[] args) {
        MotorManagement mg = new MotorManagement();
        Motor motor1 = new Motor( "honda", "red white", "CBR 150", 80000000,150);
        Motor motor2 = new Motor("suzuki", "black", "GSX 150", 70000000,150);
        mg.add(motor1);
        mg.add(motor2);

        mg.print();
        Motor motor3 = new Motor("yamaha", "yellow", "R15", 120000000,150);

        mg.fix("GSX 150",motor3);
        mg.print();
//        System.out.println(mg.search("GSX 150"));
//        mg.print();
        mg.sort();
        mg.print();
    }
}


