public class Wall implements Obstacles {

private int height;


    public Wall(int height) {

        this.height = height;
    }


    @Override
    public void doThis(Activities object) {

        object.isJump(height);

    }
}

