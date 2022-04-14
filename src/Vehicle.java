public abstract class Vehicle {
    private String firm;
    private String color;
    private String name;
    private int price;


    public Vehicle() {
    }

    public Vehicle(String firm, String color, String name, int price) {
        this.firm = firm;
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
