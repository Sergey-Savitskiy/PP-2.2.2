package web.model;
public class Car {
    private String name;
    private String color;
    private String number;

    public Car() {
    }

    public Car(String name, String color, String number) {
        this.name = name;
        this.color = color;
        this.number = number;
    }

    public String getCarName() {
        return name;
    }

    public void setCarName(String name) {
        this.name = name;
    }

    public String getCarColor() {
        return color;
    }

    public void setCarColor(String color) {
        this.color = color;
    }

    public String getCarNumber() {
        return number;
    }

    public void setCarNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car '\''" + "name - " + name + "'\''" + "color - " + color + "'\''" + "number - " + number;
    }
}

