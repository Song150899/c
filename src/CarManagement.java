import java.util.Arrays;

public class CarManagement implements Manager<Car> {
    private Car[] list = new Car[3];
    private int size = 0;


    public int getSize() {
        return size;
    }

    @Override
    public void add(Car car) {
        list[size] = car;
        size++;
    }

    @Override
    public void fix(String name, Car car) {
        list[search(name)]= car;

    }

    @Override
    public void delete(String name) {

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
        System.out.println("==================");

    }

    @Override
    public void sort() {
        Arrays.sort(list);

    }

    public static void main(String[] args) {
        CarManagement mg = new CarManagement();
        Car car1 = new Car(" Mercedes Benz", " Black", "S450", 400000000, 4);
        Car car2 = new Car(" Mercedes Benz", " White", "G63", 600000000, 6);
        Car car3 = new Car(" Honda", " Red", "Civic", 2000000000, 4);
        mg.add(car1);
        mg.add(car2);
        mg.add(car3);
        mg.print();

        System.out.println(mg.search("G63"));

        Car car4 = new Car(" Mayback", " Black", "S650", 800000000, 4);
        mg.fix("S450",car4);
        mg.print();

        mg.sort();
        mg.print();

    }

}

