package Homework4;

public class Hause {
    int roomsCount;
    double length;
    double width;
    double high;
    String color;

    @Override
    public String toString() {
        return "Hause{" +
                "roomsCount=" + roomsCount +
                ", length=" + length +
                ", width=" + width +
                ", high=" + high +
                ", color='" + color + '\'' +
                '}';
    }

    public Hause (int roomsCount, double length, double width, double high, String color) {
        this.color = color;
        this.high = high;
        this.length = length;
        this.width = width;
        this.roomsCount = roomsCount;

    }
}
