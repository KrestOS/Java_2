public class Robot implements Activities {

    private String name;

    boolean flag = true;

    int maxJump;
    int maxRun;

    public Robot(String name,int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }


    @Override
    public void isRun(int distance) {

        if (distance <= maxRun && flag == true){

            System.out.println(name + " run " + distance + " meters");

        }else {

            flag = false;
            return;

        }
    }

    @Override
    public void isJump(int height) {

        if (height <= maxJump && flag == true){
            System.out.println(name + "  jump " + height + " meters");

        }else{

            flag = false;
            return;

        }

    }
}
