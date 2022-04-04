package io.github.buginspector.javainspector;

public class Car {
    private final Window frontWindow;
    private final String color;

    public Car(Window frontWindow, String color) {
        this.frontWindow = frontWindow;
        this.color = color;
    }

    public Window getFrontWindow() {
        return frontWindow;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (frontWindow != null ? !frontWindow.equals(car.frontWindow) : car.frontWindow != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        int result = frontWindow != null ? frontWindow.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
