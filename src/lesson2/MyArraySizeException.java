package lesson2;

public class MyArraySizeException  extends ArrayIndexOutOfBoundsException{

    private int x;
    private int y;

    public MyArraySizeException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
