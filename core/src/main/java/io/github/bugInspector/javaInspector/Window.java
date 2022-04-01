package io.github.bugInspector.javaInspector;

public class Window {
    private final int size;

    public Window(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Window window = (Window) o;

        return size == window.size;
    }

    @Override
    public int hashCode() {
        return size;
    }
}
