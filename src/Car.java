public class Car extends Vehicle implements Comparable<Car>{
    private int seat;

    public Car() {
    }

    public Car(int seat) {
        this.seat = seat;
    }

    public Car(String firm, String color, String name, int price, int seat) {
        super(firm, color, name, price);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Car { " +
                " Firm= "+ getFirm()+
                ", Color= "+ getColor()+
                ", Name= " + getName()+
                ", Price= "+ getPrice()+
                ", Seat=" + seat +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getPrice()-o.getPrice();
    }
}
