package lesson2;

public class MyArrayDataException extends NumberFormatException{

    private String element;
    private int x;
    private int y;

    public MyArrayDataException(String element, int x, int y) {
        this.element = element;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getElement() {
        return element;
    }
}
