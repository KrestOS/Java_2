public class MainHW1 {

    public static void main(String[] args) {

        Obstacles[] obstacles = new Obstacles[]{
                new Wall(50),
                new Treadmill(500),
                new Wall(100),
                new Treadmill(1300),
                new Wall(600),
                new Treadmill(1000),

        };
        Activities[] players = new Activities[]{

                new Human("Alex", 50, 1000),
                new Human("Pit", 100, 300),
                new Human("Greg", 200, 2),
                new Cat("Barsik", 40, 700),
                new Cat("Myrka", 70, 1500),
                new Cat("Bars",650, 750 ),
                new Robot("Chappie",500,1500),
                new Robot("Prototype",70,4000),
                new Robot("CJ7",800, 1000)

        };

        for (int i = 0; i < players.length; i++) {


            for (int j = 0; j < obstacles.length; j++) {

                obstacles[j].doThis(players[i]);


            }

            System.out.println();
         }



    }
}










