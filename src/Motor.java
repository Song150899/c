public class Motor extends Vehicle implements Comparable<Motor>{
    private int capacity;

    public Motor() {
    }

    public Motor(int capacity) {
        this.capacity = capacity;
    }

    public Motor(String firm, String color, String name, int price, int capacity) {
        super(firm, color, name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motor {" +
                " Firm= "+ getFirm()+
                ", Color= "+ getColor()+
                ", Name= " + getName()+
                ", Price= "+ getPrice()+
                ", Capacity=" + capacity +
                '}';
    }

    @Override
    public int compareTo(Motor o) {
        return this.getPrice()- o.getPrice();
    }
}
