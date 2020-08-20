public class Treadmill implements Obstacles{
private int distance;

    public Treadmill(int distance) {
        this.distance = distance;

    }


    @Override
    public void doThis(Activities object) {

        object.isRun(distance);

    }
}
